package climateheroapp;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 * Class to keep CO2 emission records Can use either an ArrayListDataSource or a
 * FileDataSource object as DataSource.
 *
 * @author idiltatar
 */
public class EmissionRecords {

    // Underlying data source (ArrayList or File)
    private final DataSource emissions;

    /**
     *
     * @param dataSourceType Data source type (0 = ArrayList, 1 = File)
     */
    public EmissionRecords(int dataSourceType) {
        if (dataSourceType == FileDataSource.DS_TYPE) {
            emissions = new FileDataSource();
        }
        else if (dataSourceType == ArrayListDataSource.DS_TYPE) {
            emissions = new ArrayListDataSource();
        } 
        else {
            throw new IllegalArgumentException("Unknown data source type!");
        }
    }

    /**
     * Constructs a TransportCarbonEmission object from given arguments, and
     * adds it to emission records ArrayList
     *
     * @param origin Start location name of the transport
     * @param destination End location name of the transport
     * @param distanceInKm Distance between origin and destination (in
     * kilometers)
     * @param vehicleType Type of transport vehicle
     * @param date Transportation date (String)
     */
    public void add(
            String origin,
            String destination,
            double distanceInKm,
            String vehicleType,
            String date
    ) {
        Route route = new Route(origin, destination, distanceInKm, "");
        Vehicle vehicle = new Vehicle(vehicleType);
        Transport transport = new Transport(vehicle, route);
        TransportCarbonEmission emission = new TransportCarbonEmission(transport, date);
        add(emission);
    }

    /**
     * Adds the given record to the list of emission records (For testing
     * purposes)
     *
     * @param emissionRecord Emission record to add to the list
     */
    public void add(TransportCarbonEmission emissionRecord) {
        emissions.persist(emissionRecord);
    }

    /**
     * Looks up emission records for the given vehicleType
     *
     * @param vehicleType Type of transport vehicle
     * @return An ArrayList of matching TransportCarbonEmission objects
     */
    public ArrayList<TransportCarbonEmission> searchByVehicleType(String vehicleType) {
        return emissions.searchByVehicleType(vehicleType);
    }

    /**
     * Looks up emission records for the given date range
     *
     * @param dateFrom Search start date
     * @param dateTo Search end date
     * @return An ArrayList of matching TransportCarbonEmission objects
     */
    public ArrayList<TransportCarbonEmission> searchByDateRange(String dateFrom, String dateTo) {
        return emissions.searchByDateRange(dateFrom, dateTo);
    }

    /**
     * Finds and removes the record from emission records
     *
     * @param recordToDelete Emission record to delete
     */
    public void delete(TransportCarbonEmission recordToDelete) {
        emissions.delete(recordToDelete); // uses equals() method of TransportCarbonEmission class
    }

    /**
     * Converts a given list of emission records to String for printing purposes
     *
     * @param records List of emission records
     * @return A String containing the combination of String representations of
     * emission records
     */
    public String getRecords(ArrayList<TransportCarbonEmission> records) {
        return emissions.getRecords(records);
    }

    /**
     * Prints all emission records
     */
    public void printAllRecords() {
        emissions.printAllRecords();
    }

    /**
     * Prints all records found in given emissionRecords
     *
     * @param emissionRecords List of emission records to print
     */
    public void printRecordSet(ArrayList<TransportCarbonEmission> emissionRecords) {
        emissions.printRecordSet(emissionRecords);
    }

    /**
     * Gets the number of records found in the data source.
     *
     * @return Total number of records
     */
    public int getRecordCount() {
        return emissions.getRecordCount();
    }

    /**
     * Test method
     *
     * @param args
     */
    public static void main(String[] args) {
        EmissionRecords records = new EmissionRecords(FileDataSource.DS_TYPE);
        records.add("Dublin", "Cork", 260, Vehicle.ELECTRIC_CAR, "2023-12-01");
        records.add("Dublin", "Cork", 207, Vehicle.TRAIN, "2023-12-02");
        records.add("Home", "Park", 5, Vehicle.BICYCLE, "2023-11-30");
        records.add("Home", "School", 30, Vehicle.BUS, "2023-10-02");

        ArrayList<TransportCarbonEmission> results = records.searchByDateRange("2023-12-01", "2023-12-03");
        System.out.println(results.size() + " should be 2");

        results = records.searchByDateRange("2023-11-29", "2023-12-03");
        System.out.println(results.size() + " should be 3");

        results = records.searchByDateRange("2023-10-02", "2023-12-03");
        System.out.println(results.size() + " should be 4");

        results = records.searchByDateRange("2023-12-04", "2023-12-24");
        System.out.println(results.size() + " should be 0");

        results = records.searchByVehicleType(Vehicle.DIESEL_CAR);
        System.out.println(results.size() + " should be 0");

        results = records.searchByVehicleType(Vehicle.BUS);
        System.out.println(results.size() + " should be 1");

        Route route = new Route("Home", "School", 30, "");
        Vehicle vehicle = new Vehicle(Vehicle.BUS);
        Transport transport = new Transport(vehicle, route);
        TransportCarbonEmission emission = new TransportCarbonEmission(transport, "2023-10-02");

        records.delete(emission);
        System.out.println(records.getRecordCount() + " should be 3");

        results = records.searchByVehicleType(Vehicle.BUS);
        System.out.println(results.size() + " should be 0 now");

        records.printAllRecords();

    }

}
