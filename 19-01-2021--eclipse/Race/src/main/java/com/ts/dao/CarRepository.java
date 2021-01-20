package com.ts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.Car;


@Repository
public interface CarRepository extends JpaRepository<Car,Integer>{

}
