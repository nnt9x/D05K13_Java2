package design_pattern.factory_method;

public class TPBank implements Bank{
    @Override
    public String getBankName() {
        return "TPBank";
    }

    @Override
    public void payment() {
        System.out.println("Triển khai riêng của TPBank");
    }
}
