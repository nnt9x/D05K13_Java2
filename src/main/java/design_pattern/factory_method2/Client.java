package design_pattern.factory_method2;

public class Client {
    public static void main(String[] args) {
        CreditCard creditCard = CardFactory.getCreditCard(CardType.MONEY_BACK);

        System.out.println(creditCard.getCreditLimit());
        System.out.println(creditCard.getCardType());

        creditCard = CardFactory.getCreditCard(CardType.GOLD);
        System.out.println(creditCard.getCardType());
        System.out.println(creditCard.getCreditLimit());

    }
}
