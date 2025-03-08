package interface_ornek.ornek2;

public class CashPayment implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " TL nakit ödendi.");
    }
}
