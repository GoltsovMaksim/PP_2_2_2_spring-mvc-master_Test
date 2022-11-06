package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value="count",required = false) int a, ModelMap model) {
        List<Car> tmpList = new ArrayList<>();
        tmpList.add(new Car("Toyota", "Trueno", 1999));
        tmpList.add(new Car("Nissan", "Sunny", 2001));
        tmpList.add(new Car("Subaru", "Impreza", 2007));
        tmpList.add(new Car("Lada", "Priora", 2022));
        tmpList.add(new Car("Land Rover", "Discovery", 2012));
        CarServiceImpl.setListOfCar(tmpList);
        List<Car> list = CarServiceImpl.getListedCars(a);
        model.addAttribute("listOfCar", list);
        return "cars";
    }

}

