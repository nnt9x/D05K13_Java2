package day3.truuTuong.bt;

public abstract class Shape {
    private String color = "white";

    public Shape(){}

    public Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();
}
