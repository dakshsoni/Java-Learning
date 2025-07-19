package com.abstractfactory.design.pattern;

public class VehicleShowroom {
	
	
	private Car car;
	private Bick bick;
	
	public VehicleShowroom(VehicleManufacturingFactory vehicleManufacturing) {
		super();
		this.car = vehicleManufacturing.createCar();
		this.bick = vehicleManufacturing.createBick();
	}
	
	
	public void testDrive() {
		
		car.drive();
		bick.ride();
	}
	
	
}
