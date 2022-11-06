package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) int a, ModelMap model) {
        CarServiceImpl.setListOfCar();
        List<Car> list = CarServiceImpl.getListedCars(a);
        model.addAttribute("listOfCar", list);
        return "cars";
    }

}

