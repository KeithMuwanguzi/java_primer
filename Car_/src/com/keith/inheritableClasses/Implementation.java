package com.keith.inheritableClasses;

public class Implementation {

    static Car[] cars;

    public static void main(String[] args) {
        cars = new Car[3];
        RangeRover firstCar = new RangeRover("SUV","RangeRover",270,RangeRoverBuild.SPORT);
        firstCar.setNumber_plate("UBY 001A");

        cars[0] = firstCar;

        RangeRover secondCar = new RangeRover("SUV","RangeRover",260,RangeRoverBuild.VOGUE);
        secondCar.setNumber_plate("UBX 022G");

        cars[1] = secondCar;

        Toyota thirdCar = new Toyota("Sports","Toyota",180,ToyotaBuild.MARKX);
        thirdCar.setNumber_plate("UBB 343V");

        cars[2] = thirdCar;

        for(int i = 0;i < cars.length;i++){
            System.out.println("Car:"+cars[i].getName()+ " "+cars[i].getCarBuild());
            System.out.println("Registration:"+cars[i].getNumber_plate());
        }


    }
}
