package junryo.xyz.DesignPattern.FactoryPattern.SimpleFactoryReflection;

import java.util.HashMap;
import java.util.Map;

import junryo.xyz.DesignPattern.FactoryPattern.Vehicle;

public class VechicleFactory {

	private Map<String, Class> registeredProducts = new HashMap<String, Class>();

	public void registerVehicle(String vehicleId, Class vehicleClass) {
		registeredProducts.put(vehicleId, vehicleClass);
	}

	public Vehicle createVehicle(String type) throws InstantiationException, IllegalAccessException {
		Class productClass = registeredProducts.get(type);
		return (Vehicle) productClass.newInstance();

	}

}
