package com.tit.day5javainheritence.singleinheritence.smarthomedevices;

// Creating a class SmartHomeSystem to demonstrate the functionalities of the Device and Thermostat classes
class SmartHomeSystem {
    public static void main(String[] args) {
        // Creating Thermostat objects
        Thermostat thermostat1 = new Thermostat("TH123", "ON", 22.5);
        Thermostat thermostat2 = new Thermostat("TH124", "OFF", 18.0);

        // Displaying status of the thermostats
        thermostat1.displayStatus();
        thermostat2.displayStatus();
    }
}



