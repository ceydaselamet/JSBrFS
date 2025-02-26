import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class soru_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.println("10 adet sayı giriniz: ");
        for (int i = 0; i<10 ; i++){
            int number = scanner.nextInt();
            numbers.add(number);
        }

        Collections.sort(numbers);
        numbers.reversed();

        System.out.println(numbers);
    }
}
