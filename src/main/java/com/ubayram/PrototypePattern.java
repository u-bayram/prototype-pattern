package com.ubayram;

import com.ubayram.samples.Audi;
import com.ubayram.samples.Bmw;
import com.ubayram.samples.Car;
import com.ubayram.samples.CarStore;

/**
 * User: ubayram
 * Date: 18.01.2021
 * Time: 09:19
 */
public class PrototypePattern {

    public static void main(String args[])  {
        Car car = CarStore.getCar(Audi.class,2015);
        car.printNameAndYear();

        car = CarStore.getCar(Bmw.class, 2017);
        car.printNameAndYear();
    }
}
