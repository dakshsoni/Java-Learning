package com.abstractfactory.design.pattern;

/**

<h1> Abstract Factory Design Pattern :</h1> <span>Define an interface that create families of
related and depended objects without specification of concrete classes</span>

@author Deepak Soni
*/
public class AbstractFactoryDesignPattern {
	
	public static void main(String[] args) {

		VehicleManufacturingFactory vehicleManufacturing = new GasVehicleManufacturingFactory();
		VehicleShowroom vehicleShowroom = new VehicleShowroom(vehicleManufacturing);
		vehicleShowroom.testDrive();

	}

}
