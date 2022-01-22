package com.examly.springapp.controller;

import java.util.List;

import com.examly.springapp.model.Car;
import com.examly.springapp.service.CarManagementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarManagmentController {
    @Autowired
    CarManagementService carManagementService;

    @PostMapping("/saveCar")
    public String saveCar(@RequestBody Car car){
        carManagementService.saveCar(car);
        return "OK";
    }
    @DeleteMapping("/deleteCar/{carId}")
    public String deletCar(@PathVariable("carId") String carId){
        carManagementService.deleteCar(carId);
     return "OK";
    }
    @GetMapping("/getCars")
    public List<Car> getAllCars(){
     return carManagementService.getAllCars();
    }

    @GetMapping("/getCar/{carId}")
    public Car getCarById(@PathVariable("carId") String carId){
      return carManagementService.getCarById(carId);
    }
}
