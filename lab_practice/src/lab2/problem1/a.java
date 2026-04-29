package lab2.problem1;

import java.awt.*;
import java.util.Vector;

public class a {
    public static void main(String[] args) {
        Shape3D cylinder = new Cylinder(5, 10);
        System.out.println("Surface area of Cylinder = " + cylinder.surfaceArea());
        System.out.println("Volume of Cylinder = " + cylinder.volume());

        Shape3D sphere = new Sphere(5);
        System.out.println("Surface area of Sphere = " + sphere.surfaceArea());
        System.out.println("Volume of Sphere = " + sphere.volume());

        Shape3D cube = new Cube(5);
        System.out.println("Surface area of Cube = " + cube.surfaceArea());
        System.out.println("Volume of Cube = " + cube.volume());
    }
}