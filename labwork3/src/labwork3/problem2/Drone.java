package labwork3.problem2;

public class Drone implements Flyable {
    private int x, y, altitude;
    private String name;

    public Drone(String name) {
        this.name = name;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void fly(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public int getX() { return x; }
    @Override
    public int getY() { return y; }
    @Override
    public int getAltitude() { return altitude; }

    @Override
    public String toString() {
        return name + " at (" + x + ", " + y + ", alt=" + altitude + ")";
    }
}
