package com.tit.day5javainheritence.assistprogram.vehicle;

// Creating a class VehicleTransportSystem to demonstrate the functionalities of the Vehicle and its subclasses
class VehicleTransportSystem {
    public static void main(String[] args) {
        // Creating objects for each subclass
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10000);
        Vehicle motorcycle = new Motorcycle(150, "Petrol", true);

        // Storing objects of different subclasses in an array of Vehicle type
        Vehicle[] vehicles = { car, truck, motorcycle };

        // Demonstrating polymorphism by calling displayInfo() on each object
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}
