package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private static List<Car> listOfCar;

    public static void setListOfCar() {
        listOfCar = new ArrayList<>();
        listOfCar.add(new Car("Toyota", "Trueno", 1999));
        listOfCar.add(new Car("Nissan", "Sunny", 2001));
        listOfCar.add(new Car("Subaru", "Impreza", 2007));
        listOfCar.add(new Car("Lada", "Priora", 2022));
        listOfCar.add(new Car("Land Rover", "Discovery", 2012));
    }

    public static List<Car> getListedCars(int numberOfCar) {
        if (numberOfCar <= 0 || numberOfCar > 5) {
            return listOfCar;
        }
        return listOfCar.stream().limit(numberOfCar).collect(Collectors.toList());
    }
}
