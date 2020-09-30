package com.cabSharing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE_TABLE")
public abstract class Vehicle {

	private Integer vehicleId;
	private String capacity;
	private String registrationNumber;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(Integer vehicleId, String capacity, String registrationNumber) {
		super();
		this.vehicleId = vehicleId;
		this.capacity = capacity;
		this.registrationNumber = registrationNumber;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getVehicleId() {
		return vehicleId;
	}

	public String getCapacity() {
		return capacity;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", capacity=" + capacity + ", registrationNumber="
				+ registrationNumber + "]";
	}

}
