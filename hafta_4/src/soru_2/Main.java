package soru_2;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("Ceyda Selamet", 50000);
        checkingAccount.displayInfo();
        System.out.println("--------------");
        checkingAccount.calculateInterest();
        checkingAccount.displayInfo();

        System.out.println("--------------");

        SavingsAccount savingsAccount = new SavingsAccount("Ceyda Selamet", 50000);
        savingsAccount.displayInfo();
        System.out.println("--------------");
        savingsAccount.calculateInterest();
        savingsAccount.displayInfo();
    }
}
