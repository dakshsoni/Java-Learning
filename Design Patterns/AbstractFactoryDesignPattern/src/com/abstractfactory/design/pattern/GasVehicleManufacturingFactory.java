package com.abstractfactory.design.pattern;

public class GasVehicleManufacturingFactory implements VehicleManufacturingFactory {

	@Override
	public Car createCar() {
		
		return new GasCar();
	}

	@Override
	public Bick createBick() {
		
		return new GasBick();
	}

}
