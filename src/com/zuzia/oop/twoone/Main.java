package com.zuzia.oop.twoone;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Renault", "PO 12345", Color.Red);
        System.out.println(car.info());

        car.setColor(Color.Blue);
        car.setPlate("PO 56789");

        System.out.println(car.info());

        Car car2 = new Car("Ford", "PO 11111");
        System.out.println(car2.info());

        System.out.printf("Car count: %d\n", Car.counter);
    }
}
