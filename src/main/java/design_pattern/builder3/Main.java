package design_pattern.builder3;

public class Main {
    public static void main(String[] args) {
        Order order = new Order.Builder()
                .bun(1)
                .traDa(1)
                .banhMi20k(1)
                .create();

        Order order1 = new Order.Builder()
                .banhMi20k(2)
                .caphe(2)
                .pho(1)
                .traSua(1)
                .create();

        order.printOrder();
        order1.printOrder();


    }
}
