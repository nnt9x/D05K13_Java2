package day3.truuTuong.bt;

import day3.daHinh.bt.HinhVuong;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tao hinh luu vao 1 mang
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Square(5));
        shapeList.add(new Circle(5));
        shapeList.add(new Circle(6));
        shapeList.add(new Rectangle(10, 20));

        for (Shape s: shapeList) {
            System.out.println(s.toString());
        }

        // In ra hinh co chu vi lon nhat
        Shape maxPerimeterShape = shapeList.get(0);

        for(int i = 1; i < shapeList.size(); i++){
            if(shapeList.get(i).perimeter() > maxPerimeterShape.perimeter()){
                maxPerimeterShape = shapeList.get(i);
            }
        }
        System.out.println("Hinh co chu vi lon nhat la: ");
        System.out.println(maxPerimeterShape);

    }
}
