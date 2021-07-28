package com.company;

public class Bardy extends Car{

    private int nrOfSeats;
    private String typeOfBody;

    public Bardy(String colour, int nrOfTires, int nrOfSeats, String typeOfBody) {
        super(colour, nrOfTires);
        this.nrOfSeats = nrOfSeats;
        this.typeOfBody = typeOfBody;
    }

    public int getNrOfSeats() {
        return nrOfSeats;
    }

    public void setNrOfSeats(int nrOfSeats) {
        this.nrOfSeats = nrOfSeats;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }
}
