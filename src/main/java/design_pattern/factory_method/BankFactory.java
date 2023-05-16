package design_pattern.factory_method;

public class BankFactory {

    private BankFactory(){}
    public static Bank getBank(String bank) {
        switch (bank) {
            case "TPBank":
                return new TPBank();
            case "VietcomBank":
                return new VietcomBank("abcXYZ");
            case "TechcomBank":
                return new TechcomBank();
            default:
                return null;
        }
    }
}
