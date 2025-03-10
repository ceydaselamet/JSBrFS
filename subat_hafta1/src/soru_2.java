import java.util.Scanner;

public class soru_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Dizi elemanlarını giriniz: ");

        for(int i= 0; i < array.length; i++){
            System.out.print(i+1 + ". eleman : ");
            int a = scanner.nextInt();
            array[i] = a;
        }

        System.out.println("Diziniz : ");
        for (int i = 0;i< array.length; i++)
            System.out.print(array[i] + " ");
    }
}