import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Lütfen 10 adet sayı giriniz: ");
        for (int i = 0; i<10; i++){
            int number = scanner.nextInt();
            numbers.add(number);
        }

        int largestNumber = numbers.get(0);
        int smallestNumber = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++){
            if(numbers.get(i) > largestNumber)
                largestNumber = numbers.get(i);

            if(numbers.get(i) < smallestNumber)
                smallestNumber = numbers.get(i);
        }

        System.out.println("Listedeki en büyük sayı : " + largestNumber);
        System.out.println("Listedeki en küçük sayı : " + smallestNumber);
    }
}
