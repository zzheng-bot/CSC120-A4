import java.util.ArrayList;

public class Train implements TrainRequirements{
    private Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity) {
        engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        cars = new ArrayList<Car>();
        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public Car getCar(int i) {
        return cars.get(i);
    }

    public int getMaxCapacity() {
        return cars.size() * cars.get(0).getCapacity();
    }

    public int seatsRemaining() {
        int total = 0;
        for (Car c : cars) {
            total += c.seatsRemaining();
        }
        return total;
    }

    public void printManifest() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car "+ i + ":");
            cars.get(i).printManifest();
        }
    }
}