package com.cabSharing.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DRIVER_TABLE")
public class Driver {

	private Integer regestrationId;
	private String firstName;
	private String lastName;
	private String address;
	private Vehicle vehicle;
	private Boolean available;

	public Driver() {
		super();
		this.available=true;
		// TODO Auto-generated constructor stub
	}

	public Driver(Integer regestrationId, String firstName, String lastName, String address) {
		super();
		this.regestrationId = regestrationId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.available=true;
		// this.vehicle = vehicle;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getRegestrationId() {
		return regestrationId;
	}

	public void setRegestrationId(Integer regestrationId) {
		this.regestrationId = regestrationId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "vehicle_Fk", nullable = false)
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Driver [regestrationId=" + regestrationId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", vehicle=" + vehicle + "]";
	}

}
