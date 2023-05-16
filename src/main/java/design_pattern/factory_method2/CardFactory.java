package design_pattern.factory_method2;

public class CardFactory {
    private CardFactory() {
    }

    public static CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case MONEY_BACK:
                return new MoneyBack();
            case TITANIUM:
                return new Titanium();
            case PLATINUM:
                return new Platinum();
            case GOLD:
                return new Gold();
        }
        return null;
    }
}
