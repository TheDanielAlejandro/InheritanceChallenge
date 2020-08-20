package com.company;

public class Car extends Vehicle{                                                                                       // . Creating a class Car that is a sub class of the class vehicle.

    private int wheels;                                                                                                 // . Creating the instance variables.
    private int doors;
    private int direction;
    private int gear;

    // CONSTRUCTOR

    public Car(int engine, int wheels, int doors){                                                                      // . Creating the constructor passing 3 parameters.
        super(1,0);                                                                                        // . using the method super to recall the contructor of the vehicle class.
        this.wheels = wheels;
        this.doors = doors;
        this.direction = 0;
        this.gear = 0;
    }


    // SET METHODS

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    // GET METHODS


    public int getWheels() {                                                                                            // . Get method for the Wheels instance.
        return wheels;
    }

    public int getDoors() {                                                                                             // . Get method for the Doors instance.
        return doors;
    }

    public int getDirection() {                                                                                         // . Get method for the Direction instance.
        return direction;
    }

    public int getGear() {                                                                                              // . Get method for the Gear instance.
        return gear;
    }

    // OTHER METHODS

    public void steering(int direction){
        this.direction = direction;
        System.out.println("The car is steering of " + direction + "Degrees.");
    }


    public void changingGear(int speed) {
        this.setSpeed(speed);
        this.gear = getGear();
        if(speed == 0){
            gear = 0;
        }else if(speed <= 5 ){
            gear = 1;
        }else if(speed > 5 && speed <= 15){
            gear = 2;
        }else if(speed > 15 && speed <= 50){
            gear = 3;
        }else if(speed > 50 && speed <= 80){
            gear = 4;
        }else if(speed > 80 && speed <= 120){
            gear = 5;
        }else{
            gear = 6;
        }


        if(gear == 0){
            System.out.println("The actual gear of the car is on: neutral gear.");
        }else {

            System.out.println("The actual gear of the car is on: " + gear + " gear.");
        }
    }


    @Override
    public void move(int speed) {
        super.move(speed);
        changingGear(speed);
    }

    @Override
    public int increaseSpeed(int speed){
        int actualSpeed = super.increaseSpeed(speed);
        changingGear(actualSpeed);
        return actualSpeed;
    }

    @Override
    public int decreaseSpeed(int speed){
        int actualSpeed = super.decreaseSpeed(speed);
        changingGear(actualSpeed);
        return actualSpeed;
    }
}
