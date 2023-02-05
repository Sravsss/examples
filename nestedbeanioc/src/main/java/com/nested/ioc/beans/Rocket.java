package com.nested.ioc.beans;

public class Rocket {

	private String fuelType;
	private Integer capacity;
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	public void ignite() {
		System.out.println("FuelType"+fuelType+" "+capacity);
	}
}
