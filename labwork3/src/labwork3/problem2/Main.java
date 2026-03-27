package labwork3.problem2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda Civic", 0, 0);
        Drone drone = new Drone("DJI Mavic");
        Bird eagle = new Bird("Eagle");

        car.move(10, 5);
        drone.move(3, 7);
        drone.fly(100);
        eagle.move(1, 2);
        eagle.fly(500);

        Moveable[] moveables = {car, drone, eagle};
        for (Moveable m : moveables) {
            m.move(1, 1);
            System.out.println(m);
        }
    }
}
