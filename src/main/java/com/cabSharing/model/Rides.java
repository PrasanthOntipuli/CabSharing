package com.cabSharing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "RIDES_TABLE")
public class Rides {

	private int rideId;
	private Rider rider;
	private Driver driver;
	private Float cost;

	public Rides() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getRideId() {
		return rideId;
	}

	@ManyToMany
	public Rider getRider() {
		return rider;
	}

	@ManyToMany
	public Driver getDriver() {
		return driver;
	}

	public Float getCost() {
		return cost;
	}

	public void setRideId(int rideId) {
		this.rideId = rideId;
	}

	public void setRider(Rider rider) {
		this.rider = rider;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Rides [rideId=" + rideId + ", rider=" + rider + ", driver=" + driver + ", cost=" + cost + "]";
	}

}
