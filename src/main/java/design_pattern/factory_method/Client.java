package design_pattern.factory_method;

public class Client {
    public static void main(String[] args) {
        // TPBank
        Bank bank = BankFactory.getBank("TechcomBank");
        if(bank != null) {
            System.out.println(bank.getBankName());
            bank.payment();
        }
    }
}
