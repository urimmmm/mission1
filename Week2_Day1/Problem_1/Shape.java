package mission.Week2_Day1.Problem_1;

public abstract class Shape {
    //속성
    private int dimension;
    private String color;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public Shape(int dimension, String color) {
        this.dimension = dimension;
        this.color = color;
    }

    public int getDimension() {
        return dimension;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
