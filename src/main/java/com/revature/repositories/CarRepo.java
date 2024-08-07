package com.revature.repositories;

import com.revature.model.Dealership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.revature.model.Car;

import java.util.List;
import java.util.Optional;

import com.revature.model.Dealership;

@Repository
public interface CarRepo extends JpaRepository <Car, Integer> {

    public Optional<Car> findById(int id);
    public List<Car> findCarsByMake(String make);
    public List<Car> findCarsByModel(String model);
    public List<Car> findCarsByYear(int year);
    public List<Car> findCarsByDealershipId(int dealershipId);

}