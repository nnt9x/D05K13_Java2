package day3.truuTuong;

public class Dog extends Animal{

    public Dog(){

    }
    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Gâu gâu");
    }
}
