package com.ts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ts.model.Rent;

public interface RentRepository extends JpaRepository<Rent,Integer>{

}
