package com.keith.inheritableClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Implementation {

    static Car[] cars;
    static BufferedReader reader;

    //Methods
    public static Car createCar(BufferedReader reader) throws IOException {
        System.out.print("Enter type of Car:");
        String type = reader.readLine();
        System.out.print("Enter name of Car:");
        String name = reader.readLine();
        switch(name){
            case "RangeRover":
                try{
                    RangeRoverBuild carBuild = null;
                    System.out.print("Enter the build of the RangeRover:");
                    String build = reader.readLine();
                    if(build == "VOGUE"){
                        carBuild = RangeRoverBuild.VOGUE;
                    } else if(build == "SPORT"){
                        carBuild = RangeRoverBuild.SPORT;
                    }else if(build == "CROSS"){
                        carBuild = RangeRoverBuild.CROSS;
                    }else if(build == "DESTIN"){
                        carBuild = RangeRoverBuild.DESTIN;
                    }else{
                        System.out.println("Not recognized build");
                    }
                    System.out.print("Enter max speed of Car:");
                    int speed = Integer.parseInt(reader.readLine());
                    return new RangeRover(type,name,speed,carBuild);
                }catch(Exception e){
                    System.out.println("Enter a valid integer value for the speed");
                    return null;
                }
            default:
                System.out.println("Not a recognized car");
                return null;
        }
    }

    public static void main(String[] args) throws IOException{
        reader = new BufferedReader(new InputStreamReader(System.in));

        cars = new Car[2];
        RangeRover firstCar = (RangeRover) createCar(reader);
        System.out.print("Enter the car's number plate:");
        String plate1 = reader.readLine();
        firstCar.setNumber_plate(plate1);

        RangeRover secondCar = (RangeRover) createCar(reader);
        System.out.print("Enter the car's number plate:");
        String plate2 = reader.readLine();
        firstCar.setNumber_plate(plate2);

        cars[0] = firstCar;
        cars[1] = secondCar;

        for(Car car: cars){
            System.out.println(car.getName());
            System.out.println(car.getCarBuild());
            System.out.println(car.getNumber_plate());
        }



    }
}
