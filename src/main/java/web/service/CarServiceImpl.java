package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService {
    private static final List<Car> listOfCar;
    static {
        listOfCar = new ArrayList<>();
        listOfCar.add(new Car(1,"Toyota", "Trueno", 1999));
        listOfCar.add(new Car(2,"Nissan", "Sunny", 2001));
        listOfCar.add(new Car(3,"Subaru", "Impreza", 2007));
        listOfCar.add(new Car(4,"Lada", "Priora", 2022));
        listOfCar.add(new Car(5,"Land Rover", "Discovery", 2012));
        listOfCar.add(new Car(6,"Mini", "Cooper JCW", 2021));
    }

    public List<Car> getListedCars(int numberOfCar) {
        if (numberOfCar <= 0 || numberOfCar > 5) {
            return listOfCar;
        }
        return listOfCar.stream().limit(numberOfCar).collect(Collectors.toList());
    }
}
