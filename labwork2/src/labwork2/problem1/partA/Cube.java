package labwork2.problem1.partA;

public class Cube extends Shape3D {
    private double edge;
    public Cube(double edge) {
        this.edge = edge;
    }
    @Override
    public double volume() {
        return edge * edge * edge;
    }

    @Override
    public double surfaceArea() {
        return edge * edge * 6;
    }
}
