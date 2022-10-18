package model;

public class Car {
    private String brand = "default";
    private String model = "default";
    private String volumeEngine = "1.5";
    private String color = "белый";
    private int yearCreation = 2000;
    private String country = "default";

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, String color, int yearCreation) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearCreation = yearCreation;
    }

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Car(String brand, String model, String volumeEngine, String color, int yearCreation, String country) {
        this.brand = brand;
        this.model = model;
        this.volumeEngine = volumeEngine;
        this.color = color;
        this.yearCreation = yearCreation;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(String volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearCreation() {
        return yearCreation;
    }

    public void setYearCreation(int yearCreation) {
        this.yearCreation = yearCreation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void printInfo() {
        System.out.println(brand + " " + model + ", " + yearCreation + " год выпуска, сборка " + country + ", " + color + "  цвет, объем двигателя - " + volumeEngine);
    }
}
