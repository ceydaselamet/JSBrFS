import java.util.Scanner;

public class soru_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        for(int i = 0; i <= number; i++)
            total += i;

        System.out.println("1'den " +number+ "'e kadar olan sayıların toplamı: "+total );
    }
}
