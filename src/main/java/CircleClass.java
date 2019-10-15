
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jfortney
 */
public class CircleClass {

    private double radius;
    private final double PI = 3.14159;

    CircleClass(double radius) {
        setRadius(radius);
    }

    CircleClass() {
        setRadius(0.0);
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    double getArea() {
        return PI * radius * radius;
    }

    double getDiameter() {
        return radius * 2;
    }

    double getCircumference() {
        return 2 * PI * radius;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = in.nextDouble();
        CircleClass circle = new CircleClass(radius);

        System.out.println("Radius of the circle is " + circle.getRadius());

        System.out.println("Area of the circle is " + circle.getArea());

        System.out.println("Diameter of the circle is " + circle.getDiameter());

        System.out.println("Circumference of the circle is " + circle.getCircumference());

    }
}


