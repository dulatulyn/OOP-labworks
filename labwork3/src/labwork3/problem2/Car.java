package labwork3.problem2;

public class Car implements Moveable {
    private int x, y;
    private String model;

    public Car(String model, int x, int y) {
        this.model = model;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public int getX() { return x; }

    @Override
    public int getY() { return y; }

    @Override
    public String toString() {
        return model + " at (" + x + ", " + y + ")";
    }
}
