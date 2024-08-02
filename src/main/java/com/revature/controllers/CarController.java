package com.revature.controllers;

import com.revature.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.revature.model.Car;
import java.util.List;

@RestController
public class CarController {

    CarService cs;

    @Autowired
    public CarController (CarService cs) {
        this.cs = cs;
    }

/*    @GetMapping("hello")
    public String greeting() {
        return "ARE WE RUNNING";
    }*/

    @GetMapping("car")
    public List<Car> getAllCars(){
        return cs.findAllCars();
    }

    @GetMapping("car/{id}")
    public Car findCarById(@PathVariable int id) {
        return cs.findCarById(id);
    }


}
