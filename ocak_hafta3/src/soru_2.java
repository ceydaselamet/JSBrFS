import java.util.Scanner;

public class soru_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin : ");
        int number = scanner.nextInt();

        if(number % 2 == 0)
            System.out.println("Girdiğiniz sayı çift.");
        else
            System.out.println("Girdiğiniz sayı tek");

        scanner.close();
    }
}