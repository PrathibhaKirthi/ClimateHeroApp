package climateheroapp;

import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * Class to calculate the amount of CO2 emitted during a transportation
 * @author idiltatar
 */
public class TransportCarbonEmission extends Carbon {
    
    private Transport transport;
    
    public TransportCarbonEmission (Transport transport, String date) {
        if (transport == null) throw new IllegalArgumentException("Transport cannot be null!");
        if (date == null || date.isEmpty()) throw new IllegalArgumentException("Date is required");
        
        this.transport = transport;
        this.date = date;
        this.carbon = -1; // an insignificant initial value to indicate that it is not set
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport Transport) {
        this.transport = Transport;
    }
    

    /**
     * Calculates & sets the carbon emission value
     */
    @Override
    public void calculateCarbon() {
        Route route = this.getTransport().getRoute();
        Vehicle vehicle = this.getTransport().getVehicle();
        double distanceInKm = route.getDistanceInKm();
        double emissionFactor = vehicle.getEmissionFactor();
        double energyEfficiency = vehicle.getEfficiency();
        this.carbon = (distanceInKm / energyEfficiency) * emissionFactor;
    }

    @Override
    public String getDate() {
        return date;
    }

    /**
     * Gets calculated CO2 emission amount for the transport
     * @return CO2 emission for this transport (in Kg)
     */
    @Override
    public double getCarbon() {
        if (carbon < 0) calculateCarbon();
        return carbon;
    }

    /**
     * Gets carbon emission details
     * @return Carbon emission details as String
     */
    @Override
    public String getCarbonDetails() {
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("%.2f", this.getCarbon()));
        sb.append(" kg. CO2 emission [");
        sb.append(this.getTransport());
        sb.append(" on ");
        sb.append(this.date);
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TransportCarbonEmission transportEmission = (TransportCarbonEmission) obj;
        return transportEmission.transport.equals(transport) 
                && transportEmission.date.equals(date);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(transport);
    }
    
    @Override
    public String toString() {
        return getCarbonDetails();
    }

}
