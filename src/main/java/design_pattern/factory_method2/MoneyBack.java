package design_pattern.factory_method2;

public class MoneyBack implements CreditCard{
    @Override
    public String getCardType() {
        return "MoneyBack";
    }

    @Override
    public int getCreditLimit() {
        return 15000;
    }

    @Override
    public int getAnnualCharge() {
        return 500;
    }
}
