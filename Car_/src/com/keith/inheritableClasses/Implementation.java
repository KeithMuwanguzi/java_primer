package com.keith.inheritableClasses;

public class Implementation {

    static RangeRover[] cars;

    public static void main(String[] args) {
        RangeRover firstCar = new RangeRover("SUV","RangeRover",270,RangeRoverBuild.SPORT);
        firstCar.setNumber_plate("UBY 001A");

        cars[0] = firstCar;

        RangeRover secondCar = new RangeRover("SUV","RangeRover",260,RangeRoverBuild.VOGUE);
        secondCar.setNumber_plate("UBX 022G");

        cars[1] = secondCar;

        for(int i = 0;i <= cars.length;i++){
            System.out.println(cars[i].getName()+ " "+cars[i].getBuild());
            System.out.println(cars[i].getNumber_plate());
        }


    }
}
