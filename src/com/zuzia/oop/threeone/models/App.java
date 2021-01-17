package com.zuzia.oop.threeone.models;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        Car fordFocus = new Car(90, "Ford Focus", 4);
        vehicles[0] = fordFocus;
        vehicles[1] = new Car(300, "Tesla", 4);
        vehicles[2] = new Plane(500, "Boieng 737 MAX", 6);
        vehicles[3] = new Plane(600, "Airbus 380", 10);

        Tuningable tuningable = fordFocus;
        tuningable.increaseSpeed(250);

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
