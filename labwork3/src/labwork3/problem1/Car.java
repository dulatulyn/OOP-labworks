package labwork3.problem1;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, double maxSpeed, int doors) {
        super(brand, maxSpeed);
        this.doors = doors;
    }

    @Override
    public void drive() {
        if (fuelLevel > 0) {
            fuelLevel -= 5;
            System.out.println(brand + " car is driving smoothly");
        } else {
            System.out.println(brand + " car has no fuel");
        }
    }
}
