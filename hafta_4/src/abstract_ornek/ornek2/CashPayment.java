package abstract_ornek.ornek2;

public class CashPayment extends Payment{

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println(getAmount() + " TL nakit ödendi");
    }


}
