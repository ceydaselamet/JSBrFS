package soru_2;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.05;
        System.out.println("Amount of Interest : " + interest + " TL");
        setBalance(getBalance() + interest);
        System.out.println("Current Balance : " + getBalance());
    }


}
