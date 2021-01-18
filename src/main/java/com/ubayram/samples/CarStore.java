package com.ubayram.samples;

import java.util.HashMap;
import java.util.Map;

/**
 * User: ubayram
 * Date: 18.01.2021
 * Time: 09:45
 */
public class CarStore {

    private static Map<Class, Car> carMap = new HashMap<Class, Car>();

    static {
        carMap.put(Audi.class, new Audi());
        carMap.put(Bmw.class , new Bmw());
    }

    public static Car getCar(Class clazz, Integer year) {
        Car car = (Car) carMap.get(clazz).clone();
        car.setYear(year);
        return car;
    }
}
