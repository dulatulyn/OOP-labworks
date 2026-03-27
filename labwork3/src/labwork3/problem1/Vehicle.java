package labwork3.problem1;

public abstract class Vehicle {
    protected String brand;
    protected double fuelLevel;
    protected double maxSpeed;

    public Vehicle(String brand, double maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.fuelLevel = 0;
    }

    public void refuel(double amount) {
        fuelLevel += amount;
    }

    public abstract void drive();

    @Override
    public String toString() {
        return brand + " (fuel: " + fuelLevel + ", maxSpeed: " + maxSpeed + ")";
    }
}
