package com.keith.inheritableClasses;

public class RangeRover extends Car {

    private RangeRoverBuild build;


    RangeRover(String type, String name, int max_speed, RangeRoverBuild build) {
        super(type, name, max_speed);
        this.build = build;
    }

    public RangeRoverBuild getBuild(){
        return this.build;
    }

    public void setBuild(RangeRoverBuild build){
        this.build = build;
    }

    //Methods
    public void extractSteppers(){
        System.out.println("-------------------------");
        System.out.println("Steppers extracted successfully");
    }
}
