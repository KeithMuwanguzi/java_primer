package com.keith.inheritableClasses;

public class Toyota extends Car{

    private ToyotaBuild build;

    public Toyota(String title, String name, int max_speed,ToyotaBuild build){
        super(title,name,max_speed);
        this.build = build;
    }

    public void setBuild(ToyotaBuild build) {
        this.build = build;
    }

    public ToyotaBuild getBuild(){
        return this.build;
    }

    @Override
    public String getCarBuild() {
        return this.getBuild().toString();
    }
}
