package day3.truuTuong.bt;

public class Circle extends Shape{

    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius *radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ",area=" + area() +
                ",perimeter=" + perimeter() +
                '}';
    }
}
