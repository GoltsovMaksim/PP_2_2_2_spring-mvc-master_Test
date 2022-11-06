package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private static List<Car> listOfCar;

    public static void setListOfCar(List<Car> list) {
        listOfCar = list;
    }

    public static List<Car> getListedCars(int numberOfCar) {
        if (numberOfCar <= 0 || numberOfCar > 5) {
            return listOfCar;
        }
        return listOfCar.stream().limit(numberOfCar).collect(Collectors.toList());
    }
}
