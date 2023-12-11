package climateheroapp;

import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * Class for vehicles (bus, train, diesel car, gasoline car, electric car, bicycle etc.) 
 * @author idiltatar
 */
public class Vehicle {
    // Public transport vehicles - Bus, train, etc.
    public static final String BUS = "Bus";
    public static final String TRAIN = "Train";
    
    // Personal transport vehicles - Cars
    public static final String GASOLINE_CAR = "Gasoline Car";
    public static final String DIESEL_CAR = "Diesel Car";
    public static final String ELECTRIC_CAR = "Electric Car";
    
    // Personal transport vehicles - Green
    public static final String BICYCLE = "Bicycle";
    public static final String WALK = "Walk";
    
    public static final String[] ALL_TRANSPORT_VEHICLES = new String[] {
        Vehicle.BUS, 
        Vehicle.TRAIN,
        Vehicle.GASOLINE_CAR, 
        Vehicle.DIESEL_CAR,
        Vehicle.ELECTRIC_CAR,
        Vehicle.BICYCLE,
        Vehicle.WALK
    };
    
    public static final String[] PUBLIC_TRANSPORT_VEHICLES  = new String[] {
        Vehicle.BUS, 
        Vehicle.TRAIN
    };
    
    public static final String[] PERSONAL_TRANSPORT_VEHICLES  = new String[] { 
        Vehicle.GASOLINE_CAR, 
        Vehicle.DIESEL_CAR,
        Vehicle.ELECTRIC_CAR,
        Vehicle.BICYCLE,
        Vehicle.WALK
    };
    
    public static final String[] PERSONAL_CARS = new String[] {
        Vehicle.GASOLINE_CAR, 
        Vehicle.DIESEL_CAR,
        Vehicle.ELECTRIC_CAR
    };
    
    public static final String[] GREEN_VEHICLES = new String[] {
        Vehicle.BICYCLE,
        Vehicle.WALK
    };
    
    // CO2 emission factors
    
    // The average CO2 emission factor for electricity is 0.5 kg/kWh (although this may vary by region)
    private static double ELECTRIC_CAR_CO2_EMISSION_FACTOR = 0.5;
    
    // The CO2 emission factor for diesel is approximately 2.68 kg/l
    private static double DIESEL_CAR_CO2_EMISSION_FACTOR =  2.68;
    private static double BUS_CO2_EMISSION_FACTOR =  2.68;
    
    // The CO2 emission factor for gasoline is approximately 2.31 kg/l
    private static double GASOLINE_CAR_CO2_EMISSION_FACTOR = 2.31;
    
    // The CO2 emission factor for the electricity used by the train is 0.4 kg/kWh
    private static double ELECTRIC_TRAIN_CO2_EMISSION_FACTOR = 0.4; 
    
    // The CO2 emission factor for cycling or walking is negligible
    private static double BICYCLE_CO2_EMISSION_FACTOR = 0.0;
    
    // Energy efficiency values 
    private static double BICYCLE_EFFICIENCY = 1; // will be ignored because of practically zero emission factor
    private static double ELECTRIC_TRAIN_EFFICIENCY = 2.5; // 2.5 passenger-kilometers per kWh
    private static double BUS_EFFICIENCY = 4.0; // 4 km/l
    private static double ELECTRIC_CAR_EFFICIENCY = 5.0; // 5 km/kWh
    private static double DIESEL_CAR_EFFICIENCY = 15.0; // 15 km/l
    private static double GASOLINE_CAR_EFFICIENCY = 10.0; // 10 km/l
    
    
    /**
     * Checks whether the given vehicle is of a known type
     * @param typeOfVehicle Type of vehicle to check
     * @return true if given typeOfVehicle is a known vehicle type
     */
    public static boolean isKnownVehicleType(String typeOfVehicle) {
        boolean isKnownVehicle = false;
        for (String vehicleType : Vehicle.ALL_TRANSPORT_VEHICLES ) {
            if (vehicleType.equals(typeOfVehicle)) {
                isKnownVehicle = true;
                break;
            }
        }
        return isKnownVehicle;
    }
    
    /**
     * Checks whether the given vehicle is of a known car type
     * @param typeOfVehicle - Type of the vehicle
     * @return true if given typeOfVehicle is a known car type
     */
    public static boolean isCarType(String typeOfVehicle) {
        boolean isCar = false;
        for (String car : Vehicle.PERSONAL_CARS ) {
            if (car.equals(typeOfVehicle)) {
                isCar = true;
                break;
            }
        }
        return isCar;
    }
    
    // Properties 
    // Reserved for the package and subclasses
    
    // Vehicle type
    private final String type;
    
    // Energy (fuel or electric) efficiency of the car (given in km/l or km/kWh, depending on the car type) 
    private double efficiency; 
    
    // CO2 emission factor of this vehicle
    private double emissionFactor;
    
    // Default constructor
    public Vehicle() {
        // Assuming it is a gasoline car, because it is the most used one
        this(Vehicle.GASOLINE_CAR);
    }
    
    // Overloaded constructor
    public Vehicle(String typeOfVehicle) {
        if (Vehicle.isKnownVehicleType(typeOfVehicle)) {
            this.type = typeOfVehicle;
            this.setEmissionFactorAndEnergyEfficiencyValues();
        } else {
            throw new IllegalArgumentException("Type of vehicle unknown!");
        }
        
    }
    
    /**
     * Gets the type of this vehicle
     * @return Vehicle type
     */
    public String getType() {
        return type;
    }

    /**
     * Gets CO2 emission factor of this vehicle
     * @return CO2 emission factor
     */
    public double getEmissionFactor() {
        return emissionFactor;
    }
    
    /**
     * Gets the energy (fuel or electric) efficiency factor of this car
     * @return Energy efficiency factor
     */
    public double getEfficiency() {
        return efficiency;
    }
    
    /**
     * Sets emissionFactor and energy efficiency values of this vehicle
     */
    private void setEmissionFactorAndEnergyEfficiencyValues() {
        switch (this.type) {
            case Vehicle.BICYCLE:
            case Vehicle.WALK: 
                // Cycling or walking
                this.emissionFactor = BICYCLE_CO2_EMISSION_FACTOR;
                this.efficiency = BICYCLE_EFFICIENCY;
                break;
            case Vehicle.ELECTRIC_CAR:
                // Electric car
                this.emissionFactor = ELECTRIC_CAR_CO2_EMISSION_FACTOR;
                this.efficiency = ELECTRIC_CAR_EFFICIENCY;
                break;
            case Vehicle.DIESEL_CAR: 
                // Diesel powered car
                this.emissionFactor = DIESEL_CAR_CO2_EMISSION_FACTOR;
                this.efficiency = DIESEL_CAR_EFFICIENCY;
                break;
            case Vehicle.BUS: 
                // Diesel powered bus
                this.emissionFactor = BUS_CO2_EMISSION_FACTOR;
                this.efficiency = BUS_EFFICIENCY;
                break;
            case Vehicle.TRAIN: 
                // Electric train
                this.emissionFactor = ELECTRIC_TRAIN_CO2_EMISSION_FACTOR;
                this.efficiency = ELECTRIC_TRAIN_EFFICIENCY;
                break;
            default: // Gasoline powered car
                this.emissionFactor = GASOLINE_CAR_CO2_EMISSION_FACTOR;
                this.efficiency = GASOLINE_CAR_EFFICIENCY;
        }
        
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return type.equals(vehicle.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(type, efficiency, emissionFactor);
    }
    
    @Override
    public String toString() {
        return type;
    }
    
}
