package com.udemy.oop.classes.car;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setDoors(int doors){
        this.doors = doors;
    }

    public int getDoors(){
        return this.doors;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    public int getWheels(){
        return this.wheels;
    }

    public void setModel(String model){

        String validModel = model.toLowerCase();

        if (validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }

        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public void setEngine(String engine){
        this.engine = engine;
    }

    public String getEngine(){
        return this.engine;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String getColour(){
        return this.engine;
    }

}
