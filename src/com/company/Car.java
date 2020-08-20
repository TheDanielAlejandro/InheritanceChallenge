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

    public void setWheels(int wheels) {                                                                                 // . Set method for the wheels instance.
        this.wheels = wheels;
    }

    public void setDoors(int doors) {                                                                                   // . Set method for the doors instance.
        this.doors = doors;
    }

    public void setDirection(int direction) {                                                                           // . Set method for the direction instance.
        this.direction = direction;
    }

    public void setGear(int gear) {                                                                                     // . Set method for the Gear instance.
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

    public void steering(int direction){                                                                                // . Creating a method steering with one parameter of type int.
        this.direction = direction;                                                                                     // . The method set the value to the instance variable.
        System.out.println("The car is steering of " + direction + "Degrees.");                                         // . Printing the outcome.
    }


    public void changingGear(int speed) {                                                                               // . Creating a method changingGear.

        if(speed == 0){                                                                                                 // . If statement to check the the range of speed to set the gear.
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


        if(gear == 0){                                                                                                  // . If the speed is 0 the car is not moving, then is on neutral.
            System.out.println("The actual gear of the car is on: neutral gear.");
        }else {

            System.out.println("The actual gear of the car is on: " + gear + " gear.");                                 // . if not print the message + the gear.
        }
    }


    @Override                                                                                                           // . Overriding the move method from the parent class (Vehicle).
    public void move(int speed) {
        super.move(speed);
        changingGear(speed);                                                                                            // . We add another method that changes the gear in base of the speed settled.
    }

    @Override                                                                                                           // . Overriding the increaseSpeed method from the parent class (Vehicle).
    public int increaseSpeed(int speed){
        int actualSpeed = super.increaseSpeed(speed);                                                                   // . Retrieving the the actual speed after increasing it with the method.
        changingGear(actualSpeed);                                                                                      // . Calling the method changingGear and using the actual speed as a parameter.
        return actualSpeed;
    }

    @Override                                                                                                           // . Overriding the decreaseSpeed method from the parent class (Vehicle).
    public int decreaseSpeed(int speed){
        int actualSpeed = super.decreaseSpeed(speed);                                                                   // . Retrieving the the actual speed after increasing it with the method.
        changingGear(actualSpeed);                                                                                      // . Calling the method changingGear and using the actual speed as a parameter.
        return actualSpeed;
    }
}
