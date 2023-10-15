package mission.Week2_Day1.Problem_1;

import mission.Week2_Day1.Problem_1.Shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public double calculateDiagonal(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width+height) * 2;
    }

    public Rectangle(double width, double height) {
        super(2, "기본색");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
