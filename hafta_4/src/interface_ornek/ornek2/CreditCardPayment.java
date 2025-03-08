package interface_ornek.ornek2;

public class CreditCardPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " TL kredi kartı ile ödendi.");
    }
}
