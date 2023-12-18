package com.pluralsight.simplespring;

public class Pet {
    private int id = 0;
    private String name = "Basic pet";
    private double weight = 1.0;

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
