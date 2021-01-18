package com.ubayram.samples;

/**
 * User: ubayram
 * Date: 18.01.2021
 * Time: 09:19
 */
public class Bmw extends Car {

    public Bmw() {
        this.setName("Bmw");
    }

    @Override
    public void printNameAndYear() {
        System.out.println("Car : " + this.getName() + " Year : " + getYear());
    }
}
