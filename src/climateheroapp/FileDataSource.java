package climateheroapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 * The DataSource implementation where a File acts as the underlying data
 * source. Used by EmissionRecords class.
 *
 * @author idiltatar
 */
public class FileDataSource extends DataSource {

    private final File db;

    // Constant type of this data source 
    public static int DS_TYPE = 1;

    // Constant path to the file to be used as the data source
    private static final String DS_FILE = "journeys.txt";

    // Constant char to use as delimiter when saving the record to db
    private static final String DELIMITER = "*";

    public FileDataSource() {
        super(DS_TYPE);
        db = new File(DS_FILE);
    }

    /**
     * Converts an emission record into String so that it can be written into data source (File)
     * @param emission Transport carbon emission record
     * @return String representation of carbon emission record
     */
    private String stringifyRecord(TransportCarbonEmission emission) {
        emission.calculateCarbon();
        Transport transport = emission.getTransport();
        Route route = transport.getRoute();
        Vehicle vehicle = transport.getVehicle();
        // Extract and prepare values
        double co2 = emission.getCarbon();
        String date = emission.getDate();
        String vehicleType = vehicle.getType();
        String origin = route.getOrigin();
        String destination = route.getDestination();
        double distance = route.getDistanceInKm();
        return String.join(
                DELIMITER,
                date,
                origin,
                destination,
                vehicleType,
                Double.toString(distance),
                Double.toString(co2)
        );
    }

    /**
     * Reconstructs the original TransportCarbonEmission object from a record (line) read from the data source file.
     * @param record Record (line) that was read from the data source file
     * @return Reconstructed TransportCarbonEmission object
     */
    private TransportCarbonEmission reconstructEmissionFromString(String record) {
        if (record == null || record.isEmpty()) {
            return null;
        }
        String[] fields = record.split("\\*");
        String date = fields[0];
        String origin = fields[1];
        String destination = fields[2];
        String vehicleType = fields[3];
        double distance = Double.parseDouble(fields[4]);
        // double co2 = Double.parseDouble(fields[5]);
        Route route = new Route(origin, destination, distance, "");
        Vehicle vehicle = new Vehicle(vehicleType);
        Transport transport = new Transport(vehicle, route);
        TransportCarbonEmission emission = new TransportCarbonEmission(transport, date);
        // emission.calculateCarbon();
        return emission;
    }

    /**
     * Appends an emission record to the DS_FILE
     *
     * @param record Emission record to append to the DS_FILE
     */
    private void appendToFile(String record) throws IOException {
        FileWriter fw = new FileWriter(db, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(record);
        bw.newLine();
        bw.close();
    }
    
    /**
     * Clears data source file contents
     */
    private void clearFile () {
        try {
            new FileWriter(db, false).close();
        } catch (IOException ex) {
            System.out.println("Could not clear file contents");
        }
        
    }

    /**
     * Gets all records available in the data source file as an ArrayList
     * @return List of records available in the data source file
     */
    private ArrayList<TransportCarbonEmission> getDataAsArray() {
        ArrayList<TransportCarbonEmission> records = new ArrayList<>();
        try {
            FileReader fr = new FileReader(DS_FILE);
            BufferedReader br = new BufferedReader(fr);

            TransportCarbonEmission record = reconstructEmissionFromString(br.readLine());
            while (record != null) {
                records.add(record);
                record = reconstructEmissionFromString(br.readLine());
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error finding file:" + e);
        } catch (IOException e) {
            System.out.println("Error reading from file:" + e);
        }
        return records;
    }

    /**
     * Persists the given emission record to data
     *
     * @param emissionRecord Emission record to add to the data source.
     */
    @Override
    public void persist(TransportCarbonEmission emissionRecord) {
        try {
            appendToFile(stringifyRecord(emissionRecord));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Looks up emission records for the given vehicleType
     *
     * @param vehicleType Type of transport vehicle
     * @return An ArrayList of matching TransportCarbonEmission objects
     */
    @Override
    public ArrayList<TransportCarbonEmission> searchByVehicleType(String vehicleType) {
        ArrayList<TransportCarbonEmission> results = new ArrayList<>();

        for (TransportCarbonEmission emissionRecord : this.getDataAsArray()) {
            if (emissionRecord.getTransport().getVehicle().getType().equalsIgnoreCase(vehicleType)) {
                results.add(emissionRecord);
            }
        }
        return results;
    }

    /**
     * Looks up emission records for the given date range
     *
     * @param dateFrom Search start date
     * @param dateTo Search end date
     * @return An ArrayList of matching TransportCarbonEmission objects
     */
    @Override
    public ArrayList<TransportCarbonEmission> searchByDateRange(String dateFrom, String dateTo) {
        ArrayList<TransportCarbonEmission> results = new ArrayList<>();

        LocalDate startDate = LocalDate.parse(dateFrom, DataSource.FORMATTER);
        LocalDate endDate = LocalDate.parse(dateTo, DataSource.FORMATTER);

        for (TransportCarbonEmission emissionRecord : this.getDataAsArray()) {
            LocalDate emissionDate = LocalDate.parse(emissionRecord.getDate(), DataSource.FORMATTER);
            if ((emissionDate.compareTo(startDate) >= 0) && (emissionDate.compareTo(endDate) <= 0)) {
                results.add(emissionRecord);
            }
        }
        return results;
    }

    /**
     * Finds and removes the record from the data source.
     *
     * @param recordToDelete The emission record to remove
     */
    @Override
    public void delete(TransportCarbonEmission recordToDelete) { 
        ArrayList<TransportCarbonEmission> db = this.getDataAsArray();
        db.remove(recordToDelete); // uses equals() method of TransportCarbonEmission class
        clearFile();
        try {
            for (TransportCarbonEmission emission : db) {
                appendToFile(stringifyRecord(emission));
            }
        } catch (IOException ex) {
            System.out.println("Error while writing to file...");
        }
    }

    /**
     * Prints all emission records found in the data source.
     */
    @Override
    public void printAllRecords() {
        if (this.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sorry, there are no emission records to display");
        } else {
            JOptionPane.showMessageDialog(null, getRecords(this.getDataAsArray()));
        }
    }

    /**
     * Checks whether the data source contains any records.
     *
     * @return `true if the data` source contains no records.
     */
    @Override
    public boolean isEmpty() {
        ArrayList<TransportCarbonEmission> db = this.getDataAsArray();
        return db == null || db.isEmpty();
    }

    /**
     * Gets the number of records found in the data source.
     *
     * @return Total number of records
     */
    @Override
    public int getRecordCount() {
        ArrayList<TransportCarbonEmission> db = this.getDataAsArray();
        return db.size();
    }

}
