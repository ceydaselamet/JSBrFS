package abstract_ornek.ornek2;

public class CreditCardPayment extends Payment{

    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println(getAmount() + " TL kredi kartı ile ödendi");
    }
}
