package hiber.service;

import hiber.model.Car;

import java.util.List;

public interface CarService {
    void add(Car user);
    List<Car> listCars();
}
