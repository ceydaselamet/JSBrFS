package abstract_ornek.ornek2;

public class Main {
    public static void main(String[] args) {
        Payment cash = new CashPayment(500);
        cash.printAmount();
        cash.processPayment();

        System.out.println("----------");

        Payment credit = new CreditCardPayment(1000);
        credit.printAmount();
        credit.processPayment();
    }
}
