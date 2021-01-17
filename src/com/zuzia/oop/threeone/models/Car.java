package com.zuzia.oop.threeone.models;

public class Car extends Vehicle implements Tuningable {
    private int numberOfDoors;

    public Car(int speed, String model, int numberOfDoors) {
        super(speed, model);
        this.setNumberOfDoors(numberOfDoors);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return String.format("%s number of doors:%d", super.toString(), this.getNumberOfDoors());
    }

    @Override
    public void increaseSpeed(int newSpeed) {
        this.setSpeed(newSpeed);
    }
}
