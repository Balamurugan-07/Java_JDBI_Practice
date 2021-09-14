package com.balamurugan.util;


import java.util.List;

import com.balamurugan.factory.CarsFactory;
import com.balamurugan.model.Cars;



public class App {
    public static void main( String[] args ) throws Exception {
        List<Cars> cars = CarsFactory.getAllCars();
        for (Cars car : cars) {
            System.out.println(car.toString());
        }
    }
}
