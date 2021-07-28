package com.company;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private boolean likesBardy;
    private boolean hasBardy;
    private int bardiesOwned;

    public Person(String name, int age, boolean likesBardy, boolean hasBardy, int bardiesOwned) {
        this.name = name;
        this.age = age;
        this.likesBardy = likesBardy;
        this.hasBardy = hasBardy;
        this.bardiesOwned = bardiesOwned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLikesBardy() {
        return likesBardy;
    }

    public void setLikesBardy(boolean likesBardy) {
        this.likesBardy = likesBardy;
    }

    public boolean isHasBardy() {
        return hasBardy;
    }

    public void setHasBardy(boolean hasBardy) {
        this.hasBardy = hasBardy;
    }

    public int getBardiesOwned() {
        return bardiesOwned;
    }

    public void setBardiesOwned(int bardiesOwned) {
        this.bardiesOwned = bardiesOwned;
    }
}
