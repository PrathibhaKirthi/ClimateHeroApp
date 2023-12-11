package climateheroapp;

import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * A transport object consists of a Vehicle and a Route
 * @author idiltatar
 */
public class Transport {
    private Vehicle vehicle;
    private Route route;
    
    public Transport(Vehicle vehicle, Route route) {
        if (vehicle == null || route == null) {
            throw new IllegalArgumentException("Vehicle or route is required!");
        }
        this.vehicle = vehicle;
        this.route = route;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Transport transport = (Transport) obj;
        return route.equals(transport.route) && vehicle.equals(transport.vehicle);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(route, vehicle);
    }
    
    @Override
    public String toString() {
        return "Transport: " + route + " via " + vehicle;
    }
    
    
}
