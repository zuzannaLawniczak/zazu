package com.zuzia.oop.threeone.models;

public class Plane extends Vehicle {
    private int numberOfSeats;

    public Plane(int speed, String model, int numberOfSeats) {
        super(speed, model);
        this.setNumberOfSeats(numberOfSeats);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return String.format("%s number of seats:%d", super.toString(), this.getNumberOfSeats());
    }
}
