package com.keith.inheritableClasses;

public class Car {
    private String type;
    private String name;
    private String number_plate;
    private int max_speed;

    //Constructor
    Car(String type, String name, int max_speed){
        this.type = type;
        this.name = name;
        this.max_speed = max_speed;
    }

    //Getters
    public String getType(){
        return this.type;
    }

    public String getName(){
        return this.name;
    }

    public int getMax_speed(){
        return this.max_speed;
    }

    public String getNumber_plate(){
        return this.number_plate;
    }

    //Setters
    public void setType(String type){
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMax_speed(int max_speed){
        this.max_speed = max_speed;
    }

    public void setNumber_plate(String number_plate) {
        this.number_plate = number_plate;
    }

    //methods
    public int calculateDistance(int time){
        int distance = this.getMax_speed() * time;
        return distance;
    }

    public int calculateTime(int distance){
        int time = distance / this.getMax_speed();
        return time;
    }
}
