package design_pattern.factory_method2;

public class Titanium implements CreditCard{
    @Override
    public String getCardType() {
        return "Titanium";
    }

    @Override
    public int getCreditLimit() {
        return 25000;
    }

    @Override
    public int getAnnualCharge() {
        return 1500;
    }
}
