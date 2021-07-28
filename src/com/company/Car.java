package com.company;

public class Car {
    private String colour;
    private int nrOfTires;

    public Car(String colour, int nrOfTires) {
        this.colour = colour;
        this.nrOfTires = nrOfTires;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNrOfTires() {
        return nrOfTires;
    }

    public void setNrOfTires(int nrOfTires) {
        this.nrOfTires = nrOfTires;
    }
}
