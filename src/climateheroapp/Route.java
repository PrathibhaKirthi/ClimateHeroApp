package climateheroapp;

import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * Class to identify a transportation route
 * @author idiltatar
 */

public class Route {
    private String origin; // Name of the start location
    private String destination; // Name of the end location
    private double distanceInKm; // Distance (in kilometers) between origin and destination
    private String routeName; // An optional name to identify this route
    
    public Route(String origin, String destination, double distanceInKm, String routeName) {
        if (origin == null || origin.isEmpty()) {
            throw new IllegalArgumentException("Origin is required!");
        }
        
        if (destination == null || destination.isEmpty()) {
            throw new IllegalArgumentException("Destination is required!");
        }
        
        if (distanceInKm <= 0) {
            throw new IllegalArgumentException("Distance value is invalid!");
        }
        
        this.origin = origin;
        this.destination = destination;
        this.distanceInKm = distanceInKm;
        this.routeName = routeName == null ? "" : routeName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(double distanceInKm) {
        this.distanceInKm = distanceInKm;
    }
    
    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Route route = (Route) obj;
        return Double.compare(route.distanceInKm, distanceInKm) == 0 &&
                origin.equals(route.origin) &&
                destination.equals(route.destination);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(origin, destination, distanceInKm);
    }
    
    @Override
    public String toString() {
        return origin + "-" + destination;
    }
    
}
