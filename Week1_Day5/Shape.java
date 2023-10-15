package mission.Week1_Day5;

public class Shape {
    protected String color;

    protected Shape(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    }

    protected void printInfo() {
        System.out.println("도형의 색상: " + this.color);
        System.out.println("도형의 면적: " + getArea());
    }
}
