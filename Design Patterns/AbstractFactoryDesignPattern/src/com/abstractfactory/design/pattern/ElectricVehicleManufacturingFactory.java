package com.abstractfactory.design.pattern;

public class ElectricVehicleManufacturingFactory implements VehicleManufacturingFactory {

	@Override
	public Car createCar() {
		
		return new ElectericCar() ;
	}

	@Override
	public Bick createBick() {
		
		return new ElectricBick();
	}

}
