package labwork3.problem2;

public class Bird implements Flyable {
    private int x, y, altitude;
    private String species;

    public Bird(String species) {
        this.species = species;
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
        return species + " at (" + x + ", " + y + ", alt=" + altitude + ")";
    }
}
