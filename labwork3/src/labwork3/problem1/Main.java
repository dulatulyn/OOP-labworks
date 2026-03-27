package labwork3.problem1;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 200, 4);
        car.refuel(50);
        car.drive();
        System.out.println(car);

        Printable doc = new Document("Lab Report", "OOP interfaces lab");
        doc.print();
    }
}
