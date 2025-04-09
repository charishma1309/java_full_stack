package com.example;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {
    private int ram;
    private String model;
    private String brand;

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "{" +
            " ram='" + getRam() + "'" +
            ", model='" + getModel() + "'" +
            ", brand='" + getBrand() + "'" +
            "}";
    }

}
