import java.util.Scanner;

public class soru_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int total = 0;
        double avg  = 0.0;

        System.out.println("Dizi içerisine 10 adet sayı ekleyelim.");

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            total += array[i];
        }

        avg = total / array.length;
        System.out.println("Dizinin ortalaması : " + avg);

        System.out.println("50'den büyük olan sayılar : ");
        for(int i = 0; i < array.length; i++) {
            if(array[i] > 50)
                System.out.println(array[i]);
        }


    }
}
