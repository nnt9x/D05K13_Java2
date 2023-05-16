package design_pattern.factory_method;

public class TechcomBank implements Bank{

    @Override
    public String getBankName() {
        return "TechcomBank";
    }

    @Override
    public void payment() {
        System.out.println("Triển khai riêng của TechcomBank");
    }
}
