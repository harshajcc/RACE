package com.ts.model;

import javax.persistence.GeneratedValue;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
	@Id@GeneratedValue
	private int carId;
	private String carModel;
	private String carRegistrationNumber;
	private String underMaintainance;
	private String available;
	private String lastServiceDate;
	private String isRented;
	private double pricePerKm;
	
	
	
	@ManyToOne
	@JoinColumn(name="owner_id")        
	Owner owner;


	
	public Car() {
		super();
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarRegistrationNumber() {
		return carRegistrationNumber;
	}
	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.carRegistrationNumber = carRegistrationNumber;
	}
	
	public String getUnderMaintainance() {
		return underMaintainance;
	}
	public void setUnderMaintainance(String underMaintainance) {
		this.underMaintainance = underMaintainance;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	public String getLastServiceDate() {
		return lastServiceDate;
	}
	public void setLastServiceDate(String lastServiceDate) {
		this.lastServiceDate = lastServiceDate;
	}
	public String getIsRented() {
		return isRented;
	}
	public void setIsRented(String isRented) {
		this.isRented = isRented;
	}
	public double getPricePerKm() {
		return pricePerKm;
	}
	public void setPricePerKm(double pricePerKm) {
		this.pricePerKm = pricePerKm;
	}
	
	
	
	
	
}
