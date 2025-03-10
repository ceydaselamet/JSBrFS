import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İsminizi giriniz : ");
        String name = scanner.nextLine();

        System.out.println("İsim : " + name);
    }
}