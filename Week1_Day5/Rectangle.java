package mission.Week1_Day5;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public void printRectangleInfo() {
        super.printInfo();
        System.out.println("사각형의 가로 길이: "+ width);
        System.out.println("사각형의 세로 길이: "+ height);
    }
}
