package mission.Week2_Day1.Problem_1;

import mission.Week2_Day1.Problem_1.Shape;

public class Circle extends Shape {
    private double radius;

    public double calculateDiameter(){
        return this.radius * 2;
    }
    @Override
    public double calculateArea(){
        double r = Math.pow(radius, 2);
        return Math.PI * r;
    }

    @Override
    public double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }

    public Circle(double radius) {
        super(2, "기본색");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
