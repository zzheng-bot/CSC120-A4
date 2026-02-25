import java.util.ArrayList;

public class Car implements CarRequirements{
    private ArrayList<Passenger> passengers;
    private int capacity;
    
    //constructor
    public Car(int capacity) {
        this.capacity = capacity;
        passengers = new ArrayList<Passenger>();
    }

    public int getCapacity(){
        return capacity;
    }

    public int seatsRemaining(){
        return capacity - passengers.size();
    }

    public Boolean addPassenger(Passenger p) {
        if (seatsRemaining() > 0) {
            passengers.add(p);
            return true;
        }
        return false;
    }

    public Boolean removePassenger(Passenger p) {
        if (passengers.contains(p)) {
            passengers.remove(p);
            return true;
        }
        return false;
    }

    public void printManifest() {
        if (passengers.size() == 0) {
            System.out.println("This cara is empty.");
        }
        else{
            for (Passenger p : passengers) {
                System.out.println(p.getName());
            }
        }
    }
}