package com.examly.springapp.service;

import java.util.ArrayList;
import java.util.List;

import com.examly.springapp.model.Car;
import com.examly.springapp.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarManagementService {
    @Autowired
    CarRepository carRepository;

    public List<Car> getAllCars(){
    List<Car> cars=new ArrayList<>();
    carRepository.findAll().forEach(car->cars.add(car));
    return cars;
    }
    public Car getCarById(String carId){
        return carRepository.findById(carId).get();
    }
    public void saveCar(Car car){
        carRepository.save(car);
    }
    public void deleteCar(String carId){
        carRepository.deleteById(carId);
    }
}
