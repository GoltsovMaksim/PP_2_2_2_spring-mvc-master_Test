package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.carDAO.CarDAOImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final CarDAOImpl carDAO;

    @Autowired
    public CarServiceImpl(CarDAOImpl carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getListedCars(int numberOfCar) {
        return carDAO.getListedCars(numberOfCar);
    }
}
