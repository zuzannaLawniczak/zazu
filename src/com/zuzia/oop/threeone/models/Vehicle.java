package com.zuzia.oop.threeone.models;

public abstract class Vehicle {
    private int speed;
    private String model;

    public Vehicle(int speed, String model) {
        this.setSpeed(speed);
        this.setModel(model);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("model:%s speed:%d", this.getModel(), this.getSpeed());
    }
}
