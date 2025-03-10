import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Toplanacak sayıları giriniz");
        System.out.print("Sayı 1 : ");
        double a = scanner.nextDouble();

        System.out.print("Sayı 2 : ");
        double b = scanner.nextDouble();

        double toplam = a+b;

        System.out.println("Toplam : " + toplam);

        scanner.close();
    }
}