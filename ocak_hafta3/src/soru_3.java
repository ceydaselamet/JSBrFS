import java.util.Scanner;

public class soru_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if(number > 0)
            System.out.println("Girdiğiniz sayı pozitif");
        else if (number < 0)
            System.out.println("Girdiğiniz sayı negatif");
        else
            System.out.println("Girdiğiniz sayı 0 (sıfır) ");

        scanner.close();
    }
}
