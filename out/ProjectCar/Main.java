import details.Engine;
import professions.Driver;
import vehicles.SportCar;
import vehicles.Truck;

public class Main

{
    public static void main(String[] args) {

        Driver driver = new Driver(10,"Alex", 33, "Alex Loginov");

        Engine engine = new Engine("BMW", 350);

        Driver driver2 = new Driver(20,"Alex", 53, "Alex Fox");

        Engine engine2 = new Engine("MAN", 600);

        SportCar sportCar = new SportCar("BMW", "sedan", 3, driver, engine, 250.0);

        Truck truck = new Truck("MAN", "Truck", 10, driver2, engine2, 10);
    }

}
