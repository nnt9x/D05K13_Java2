package oop.b6_2;

public class MainTest {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(5);
        GeometricObject rectangle = new Rectangle(5, 3);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Circle: " + circle);

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle: " + rectangle);

    }
}
