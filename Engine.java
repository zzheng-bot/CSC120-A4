public class Engine implements EngineRequirements{
    //Attributes
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    //Constructors
    public Engine(FuelType fuelType, double currentFuelLevel, double maxFuelLevel){
        this.fuelType = fuelType;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

    //Accessors
    public FuelType getFuelType(){
        return fuelType;
    }

    public double getCurrentFuel(){
        return currentFuelLevel;
    }

    public double getMaxFuel(){
        return maxFuelLevel;
    }

    //Refuel
    public void refuel(){
        currentFuelLevel = maxFuelLevel;
        System.out.println("Engine refueled!");
    }

    //Go
    public Boolean go(){
        if (currentFuelLevel > 0) {
            currentFuelLevel -= 10;
            System.out.println("Remain fuel: " + currentFuelLevel);
            return true;
        }
        else{
            return false;
        }
    }
}