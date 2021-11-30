package vehicles;

import details.Engine;
import professions.Driver;

public class Truck extends Car
{

public int carrying;

    @Override
    public String toString() {
        return "vehicles.Truck{" +
                "carrying=" + carrying +
                '}';
    }

    public Truck(String brand, String type, int weight, Driver driver, Engine engine, int carrying) {
        super(brand, type, weight, driver, engine);
        this.carrying = carrying;
    }
}
