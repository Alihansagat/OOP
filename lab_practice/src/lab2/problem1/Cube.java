package lab2.problem1;

public class Cube extends Shape3D {
    private double length;
    public Cube(double length) {
        this.length = length;
    }

    @Override
    public double volume() {
        return Math.pow(length, 3);
    }

    @Override
    public double surfaceArea() {
        return 6*length * length;
    }
}
