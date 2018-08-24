package junryo.xyz.DesignPattern.FactoryPattern.SimpleFactory;

import junryo.xyz.DesignPattern.FactoryPattern.Bike;
import junryo.xyz.DesignPattern.FactoryPattern.Car;
import junryo.xyz.DesignPattern.FactoryPattern.Truck;
import junryo.xyz.DesignPattern.FactoryPattern.Vehicle;

public class VehicleFactory {
	
	public enum VehicleType {
		Bike, Car, Truck
	}

	public static Vehicle create(VehicleType type) {
		if (type.equals(VehicleType.Bike)) {
			return new Bike();
		}
		if (type.equals(VehicleType.Car)) {
			return new Car();
		}
		if (type.equals(VehicleType.Truck)) {
			return new Truck();
		} else
			return null;
	}
}
