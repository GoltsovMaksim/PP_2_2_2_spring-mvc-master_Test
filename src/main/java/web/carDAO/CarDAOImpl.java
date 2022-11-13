package web.carDAO;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDAOImpl implements CarDAO{

    private static int CAR_ID;

    private final List<Car> listOfCar;

    {
        listOfCar = new ArrayList<>();
        listOfCar.add(new Car(++CAR_ID,"Toyota", "Trueno", 1999));
        listOfCar.add(new Car(++CAR_ID,"Nissan", "Sunny", 2001));
        listOfCar.add(new Car(++CAR_ID,"Subaru", "Impreza", 2007));
        listOfCar.add(new Car(++CAR_ID,"Lada", "Priora", 2022));
        listOfCar.add(new Car(++CAR_ID,"Land Rover", "Discovery", 2012));
    }
    @Override
    public List<Car> getListedCars(int id) {
        if(id <=0 || id >= listOfCar.size()) {
            return listOfCar;
        }
        return listOfCar.stream().limit(id).collect(Collectors.toList());
    }
}
