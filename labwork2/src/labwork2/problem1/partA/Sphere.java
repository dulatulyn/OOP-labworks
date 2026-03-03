package labwork2.problem1.partA;

public class Sphere extends Shape3D {
    private double radius;
    public Sphere(double r, double h) {
        this.radius = r;
    }
    @Override
    public double volume() {
        return Math.PI * radius * radius * radius;
    }

    @Override
    public double surfaceArea() {
        return Math.PI * radius * radius * 4;
    }
}
