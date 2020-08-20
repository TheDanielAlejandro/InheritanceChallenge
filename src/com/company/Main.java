package com.company;

public class Main {

    public static void main(String[] args) {

        Lamborghini firstCar = new Lamborghini(2,4,3,"Aventador");
        firstCar.move(0);
        firstCar.steering(90);

        firstCar.increaseSpeed(440);
        System.out.println(firstCar.getSpeed());
        System.out.println(firstCar.getGear());

        firstCar.decreaseSpeed(100);

    }
}
