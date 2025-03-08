package interface_ornek.ornek2;

public class Main {
    public static void main(String[] args) {
        Payment cash = new CashPayment();
        cash.processPayment(500);

        System.out.println("--------");

        Payment creditCard = new CreditCardPayment();
        creditCard.processPayment(1000);

    }
}
