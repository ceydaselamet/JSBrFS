import java.util.Scanner;

public class soru_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sıfırdan büyük bir dizi boyutu giriniz. : ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int negativeTotal = 0;
        int positiveTotal = 0;

        System.out.println("Dizi elemanlarını giriniz. Pozitif veya negatif olabilir : ");
        for(int i = 0 ; i<array.length; i++){
            array[i] = scanner.nextInt();

            if(array[i] >= 0)
                positiveTotal += array[i];
            else
                negativeTotal += array[i];
        }

        System.out.println("Girilen pozitif sayıların toplamı : " + positiveTotal);
        System.out.println("Girilen negatif sayıların toplamı : " + negativeTotal);

        scanner.close();

    }
}
