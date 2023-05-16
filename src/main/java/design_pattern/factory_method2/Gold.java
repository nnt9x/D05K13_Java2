package design_pattern.factory_method2;

public class Gold implements CreditCard{
    @Override
    public String getCardType() {
        return "Gold";
    }

    @Override
    public int getCreditLimit() {
        return 25000;
    }

    @Override
    public int getAnnualCharge() {
        return 1000;
    }
}
