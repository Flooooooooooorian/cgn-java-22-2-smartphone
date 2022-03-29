package model;

import java.util.Arrays;

public class Smartphone implements Radio, GPS{

    private String model;
    private String brand;
    private Contact[] contacts;


    public Smartphone() {
        super();
    }

    public Smartphone(String model, String brand, Contact[] contacts) {
        this.model = model;
        this.brand = brand;
        this.contacts = contacts;
    }

    @Override
    public String calculatePosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
