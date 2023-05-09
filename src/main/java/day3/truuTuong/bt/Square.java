package day3.truuTuong.bt;

public class Square extends Shape{
    private double side = 1.0;

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ",area" + area() +
                ",perimeter" + perimeter() +
                '}';
    }
}
