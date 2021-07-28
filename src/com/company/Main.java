package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // HINT
// public class Bardy extends Car
// Assuming we had a car brand, called Bardy.
// Create an object of this class, and make it extend another class called Car.
// class Car features include: noOfTires, color.
// Create another class called Person.
// Features of person include: name, age, likeBardy, hasBardy, bardiesOwned(ArrayList)
// In the main method, create a list that will contain a number of people.
// And if a person likes bardy and does not have bardy, then give them a Bardy.

        List<Bardy> bardyList = new ArrayList<>();
        
        bardyList.add(new Bardy("Blue", 4, 4, "Cabrio"));
        bardyList.add(new Bardy("Red", 3, 2, "Mini"));
        bardyList.add(new Bardy("Orange", 4, 4, "Sedan"));
        bardyList.add(new Bardy("Yellow", 3, 1, "Supermini"));
        bardyList.add(new Bardy("Green", 4, 2, "Compact"));
        bardyList.add(new Bardy("Black", 4, 4, "Coupe"));

        List<Person> personsList = new ArrayList<>();

        personsList.add(new Person("Stella", 35, true, false, 0));
        personsList.add(new Person("Gabriel", 47, false, false, 0));
        personsList.add(new Person("John", 22, true, true, 1));
        personsList.add(new Person("Lisa", 28, true, false, 0));
        personsList.add(new Person("Donald", 65, true, true, 2));
        personsList.add(new Person("Nina", 51, true, true, 1));

        Random r = new Random();

        for (Person person : personsList) {
            if (person.isLikesBardy() == true && person.isHasBardy() == false) {
                Bardy yourBardy = bardyList.get(r.nextInt(bardyList.size()));
                System.out.println("Congratulations, " + person.getName() + "! You recieve a "
                        + yourBardy.getColour() + " Bardy with " + yourBardy.getNrOfTires() + " tires and " +
                        yourBardy.getNrOfSeats() + " seats, body type " + yourBardy.getTypeOfBody() + ".");
            }
        }
    }
}
