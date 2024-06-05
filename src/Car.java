public class Car extends Vehicle {
    private double milesDriven;
    private double fuelConsumed;

    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }

    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    double calculateFuelEfficiency() {
        return milesDriven / fuelConsumed;
    }
}
