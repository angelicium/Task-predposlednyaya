package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Volkswagen", "Passat", 2016));
        cars.add(new Car("Mercedes Benz", "S class", 2022));
        cars.add(new Car("BMW", "M5", 2020));
        cars.add(new Car("Lexus", "LX", 2018));
        cars.add(new Car("Toyota", "Land Cruiser", 2010));
    }

    public List<Car> getCars(int count) {
        if (count > cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}