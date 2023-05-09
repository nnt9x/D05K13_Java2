package day3.truuTuong.bt;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){}

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return (width + length) * 2;
    }

    ;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
