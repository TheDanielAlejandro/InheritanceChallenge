package com.company;

public class Vehicle {                                                                                                  // . Creating a class Vehicle

    private int engine;                                                                                                 // . Engine and speed are instance variables.
    private int speed;

    // CONSTRUCTOR

    public Vehicle(int engine, int speed){                                                                              // . Constructor for the class vehicle with 2 parameters.
        this.engine = engine;
        this.speed = speed;
    }


    // SET METHODS

    public void setEngine(int engine) {                                                                                 // . Set method for the engine instance.
        this.engine = engine;
    }

    public void setSpeed(int speed) {                                                                                   // . Set method for the speed instance.
        this.speed = speed;
    }


    // GET METHODS

    public int getEngine() {                                                                                            // . Get method for the engine instance.
        return engine;
    }

    public int getSpeed() {                                                                                             // . Get method for the speed instance.
        return speed;
    }

    // OTHER METHODS

    public void move(int speed){                                                                                        // . Creating the method move passing one parameter speed.
        if(speed < 0){                                                                                                  // . If the speed value is less than 0 set the value to 0.
            speed = 0;
        }
        this.speed = speed;                                                                                             // . set the value to the instance variable speed.

        if(this.speed == 0 ){                                                                                           // . If the instance value is = 0 print the vehicle is not moving.
            System.out.println("The vehicle is not moving.");
        }else{                                                                                                          // . IF has a value higher than 0 print the speed + the string.
        System.out.println("The vehicle is moving at : " + speed + " KM/H");
        }
    }

    public int decreaseSpeed(int speed){                                                                                // . Creating the method decreaseSpeed with one parameter speed
        if(speed < 0){                                                                                                  // . If the speed value is less than 0 set the value to 0.
            speed = 0;
        }
        this.speed -= speed;                                                                                            // . Detract the value to the instance variable speed and replace it.
        if(this.speed < 0){                                                                                             // . If the value in the instance variable is less than 0 set the it to 0.
            setSpeed(0);
        }

        System.out.println("The vehicle is decelerating of: " + speed + " KM/H, the actual speed is: " + this.speed + " KM/H.");
        return this.speed;
    }

    public int increaseSpeed(int speed){                                                                                // . Creating the method increaseSpeed passing one parameter speed.
        if(speed < 0){                                                                                                  // . If the speed value is less than 0 set the value to 0.
            speed = 0;
        }
        this.speed += speed;                                                                                            // . Add the value to the instance variable speed and replace it.
        if(this.speed > 400){                                                                                           // . If the value in the instance variable is less than 0 set the it to 0.
            setSpeed(400);
        }

        System.out.println("The vehicle is accelerating of: " + speed + " KM/H, the actual speed is: " + this.speed + " KM/H." );
        return this.speed;
    }



}


// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.