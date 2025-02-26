import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class soru_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = new ArrayList<>();

        System.out.println("10 adet kelime giriniz: ");
        for(int i = 0; i<10 ; i++){
            String word = scanner.next();
            words.add(word);
        }

        Collections.sort(words);
        System.out.println("Sıralanmış kelimeler : " + words);
    }
}
