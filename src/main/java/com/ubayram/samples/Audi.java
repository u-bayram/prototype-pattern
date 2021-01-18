package com.ubayram.samples;

/**
 * User: ubayram
 * Date: 18.01.2021
 * Time: 09:19
 */
public class Audi extends Car {

    public Audi() {
        this.setName("Audi");
        this.setYear(null);
    }

    @Override
    public void printNameAndYear() {
        System.out.println("Car : " + this.getName() + " Year : " + getYear());
    }
}
