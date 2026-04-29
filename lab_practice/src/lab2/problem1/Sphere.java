package lab2.problem1;


public class Sphere extends Shape3D {
    double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    public double volume() {
        return (4/3)*Math.PI*Math.pow(radius,3);
    }

    @Override
    public double surfaceArea() {
        return 4*Math.PI*Math.pow(radius,2);
    }
}
