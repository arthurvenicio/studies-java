package models;

public abstract class Vehicle {
    String name;
    String model;
    String color;
    String engine;

    public Vehicle(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void saudation(){
        System.out.println("Saudation");
    }
}
