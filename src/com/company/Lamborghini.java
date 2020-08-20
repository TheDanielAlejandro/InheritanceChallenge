package com.company;

public class Lamborghini extends Car {                                                                                  // . Creating a sub class Lamborghini from the parent Car

    private String model;


    // CONSTRUCTOR.

    public Lamborghini(int engine, int wheels, int doors, String model){
        super(1,4,3);
        this.model= model;
    }



}
