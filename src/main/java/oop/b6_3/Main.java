package oop.b6_3;

public class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(0, 0, 2, 1);
        // Di chuyen len tren
        p.moveUp();
        System.out.println(p);
        // Di chuyen sang phai
        p.moveRight();
        System.out.println(p);
        // Di chuyen xuong duoi
        p.moveDown();
        System.out.println(p);
        // Di chuyen sang trai
        p.moveLeft();
        System.out.println(p);

    }
}
