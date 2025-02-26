import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class soru_6 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i<20 ; i++){
            int number = random.nextInt(101);
            numbers.add(number);

            if(number % 2 == 0)
                evenNumbers.add(number);
        }

        System.out.println("Çift sayılar : " + evenNumbers);
    }
}
