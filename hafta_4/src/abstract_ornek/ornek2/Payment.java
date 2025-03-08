package abstract_ornek.ornek2;

public abstract class Payment {

    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void printAmount(){
        System.out.println("Ödenecek Tutar : " + getAmount() );
    }

    public abstract void processPayment();

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
