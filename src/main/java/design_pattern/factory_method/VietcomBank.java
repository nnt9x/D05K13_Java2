package design_pattern.factory_method;

public class VietcomBank implements Bank{
    private String privateKey;

    public VietcomBank(String privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public String getBankName() {
        return "VietcomBank";
    }

    @Override
    public void payment() {
        System.out.println("Triển khai riêng của VietcomBank");
    }
}
