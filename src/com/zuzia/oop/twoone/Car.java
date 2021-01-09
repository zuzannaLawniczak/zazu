package com.zuzia.oop.twoone;

public class Car {
    private final String make;
    private String plate;
    private Color color;

    public static int counter = 0;

    public Car(String make, String plate) {
        this(make, plate, Color.Unknown);
    }

    public Car(String make, String plate, Color color) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        Car.counter++;
    }

    public String info() {
        return String.format("Make: %s, plate: %s, color: %s%n", this.make, this.plate, this.color);
    }

    public String getMake() {
        return make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
