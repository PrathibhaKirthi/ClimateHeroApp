package climateheroapp;

import climateheroapp.TransportCarbonEmission;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * Abstract class that provides the base data source (db) functionality.
 * The underlying data source can be an Object array, a file in the file system, or a relational database. 
 * Subclasses of this class should provide concrete implementations for operations such as add, delete, and search.
 * @author idiltatar
 */
public abstract class DataSource {
    
    // Property for data source type (for example, 0 for an ArrayList, 1 for a File data source)
    protected int dataSourceType;
    
    
    protected DataSource (int dsType) {
        this.dataSourceType = dsType;
    }
    
    // Enforcing a certain date format ("yyyy-MM-dd") to ensure consistency
    protected static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern( "yyyy-MM-dd" );
    
    /**
     * Persists the given emission record to data
     * @param emissionRecord Emission record to add to the data source. 
     */
    public abstract void persist(TransportCarbonEmission emissionRecord);
    
    /**
     * Looks up emission records for the given vehicleType 
     * 
     * @param vehicleType Type of transport vehicle
     * @return An ArrayList of matching TransportCarbonEmission objects
     */
    public abstract ArrayList<TransportCarbonEmission> searchByVehicleType(String vehicleType);
    
    /**
     * Looks up emission records for the given date range
     * 
     * @param dateFrom Search start date
     * @param dateTo  Search end date
     * @return An ArrayList of matching TransportCarbonEmission objects
     */
    public abstract ArrayList<TransportCarbonEmission> searchByDateRange(String dateFrom, String dateTo);
    
    /**
     * Finds and removes the record from the data source.
     * @param recordToDelete The emission record to remove
     */
    public abstract void delete(TransportCarbonEmission recordToDelete);
    
    /**
     * Checks whether the data source contains any records.
     * @return `true if the data` source contains no records.
     */
    public abstract boolean isEmpty();
    
    /**
     * Gets the number of records found in the data source.
     * @return Total number of records
     */
    public abstract int getRecordCount();
            
    /**
     * Prints all emission records found in the data source.
     */
    public abstract void printAllRecords();
    
    // CONCRETE METHODS
    
    /**
     * Converts a given list of emission records to String for printing purposes
     * @param records List of emission records 
     * @return A String containing the combination of String representations of emission records
     */
    public String getRecords(ArrayList<TransportCarbonEmission> records) {
        ArrayList<String> recordsStr = new ArrayList<>();
        for (TransportCarbonEmission emissionRecord : records) {
            recordsStr.add(emissionRecord.toString()); // uses toString() method of TransportCarbonEmission class
        }
        return String.join("\n", recordsStr.toArray(new String[recordsStr.size()]));
    }
    
    /**
     * Prints all records that matches within the given emissionRecords ArrayList.
     * @param emissionRecords List of emission records to print
     */
    public void printRecordSet (ArrayList<TransportCarbonEmission> emissionRecords) {
        if (emissionRecords.isEmpty()) {
            JOptionPane.showMessageDialog(null, "There are no emission records to display");
        } else {
            JOptionPane.showMessageDialog(null, getRecords(emissionRecords));    
        }
    }
}
