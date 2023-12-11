package climateheroapp;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * The DataSource implementation where an ArrayList acts as the underlying data source.
 * Used by EmissionRecords class.
 * @author idiltatar
 */
public class ArrayListDataSource extends DataSource {
    
    private ArrayList<TransportCarbonEmission> db;
    
    // Constant type of this data source 
    public static int DS_TYPE = 0;
    
    public ArrayListDataSource() {
        super(DS_TYPE);
        db = new ArrayList<>();
    }

    /**
     * Persists the given emission record to data
     * @param emissionRecord Emission record to add to the data source. 
     */
    @Override
    public void persist(TransportCarbonEmission emissionRecord) {
        db.add(emissionRecord);
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
        
        for (TransportCarbonEmission emissionRecord : db) {
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
     * @param dateTo  Search end date
     * @return An ArrayList of matching TransportCarbonEmission objects
     */
    @Override
    public ArrayList<TransportCarbonEmission> searchByDateRange(String dateFrom, String dateTo) {
        ArrayList<TransportCarbonEmission> results = new ArrayList<>();
        
        LocalDate startDate = LocalDate.parse(dateFrom, DataSource.FORMATTER);
        LocalDate endDate = LocalDate.parse(dateTo, DataSource.FORMATTER);
        
        for (TransportCarbonEmission emissionRecord : db) {
            LocalDate emissionDate = LocalDate.parse(emissionRecord.getDate(), DataSource.FORMATTER);
            if ((emissionDate.compareTo(startDate) >= 0) && (emissionDate.compareTo(endDate) <= 0)) {
                results.add(emissionRecord);
            }
        }
        return results;
    }

    /**
     * Finds and removes the record from the data source.
     * @param recordToDelete The emission record to remove
     */
    @Override
    public void delete(TransportCarbonEmission recordToDelete) {
        db.remove(recordToDelete); // uses equals() method of TransportCarbonEmission class
    }

    /**
     * Prints all emission records found in the data source.
     */
    @Override
    public void printAllRecords() {
        if (this.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sorry, there are no emission records to display");
        } else {
            JOptionPane.showMessageDialog(null, getRecords(db));    
        }
    }

    /**
     * Checks whether the data source contains any records.
     * @return `true if the data` source contains no records.
     */
    @Override
    public boolean isEmpty() {
        return db.isEmpty();
    }

    /**
     * Gets the number of records found in the data source.
     * @return Total number of records
     */
    @Override
    public int getRecordCount() {
        return db.size();
    }

}
