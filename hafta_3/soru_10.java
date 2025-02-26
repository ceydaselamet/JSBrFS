import java.util.Arrays;

public class soru_10 {
    public static void main(String[] args) {
        //Arrays.sort(int[] a): a dizisini küçükten büyüğe doğru sıralar.
        //Arrays.binarySearch(Object[] a, Object key): Sıralı bir dizide ikili arama algoritmasıyla istenilen öğeyi arar.
        //                                             a dizisi içerisinde key değerini arar.
        //
        //Arrays.copyOfRange(int[] original, int from, int to): Dizinin istenilen değer aralığını yeni bir diziye kopyalar.
        //                                                      original : dizinin adı
        //                                                      from : kopyalanmaya başlanacak indeks
        //                                                      to : kopyalanmanın biteceği indeks + 1
        //Arrays.equals(int[] a, int[] b): İki diziyi boyut ve eleman olarak karşılaştırır.
        //Arrays.fill(Object[] a, Object value): Dizinin tüm elemanlarını belirtilen değer ile doldurur.


        int[] array = new int[6];
        array[0] = 5;
        array[1] = 8;
        array[2] = 2;
        array[3] = 7;
        array[4] = 5;
        array[5] = 10;

        System.out.println("Dizi : ");
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

        System.out.println("Sıralı dizi : ");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++)
            System.out.println( array[i]);

        int index = Arrays.binarySearch(array, 5);
        System.out.println("5 değerinin indeksi : " + index);

        int[] copyArray = Arrays.copyOfRange(array, 2, 5); // yani 2, 3 ve 4. indeks kopyalanacak
        System.out.println("Kopyalanan yeni dizi : " + Arrays.toString(copyArray));

        boolean isEqual = Arrays.equals(array, copyArray);
        System.out.println("İki dizi eşit mi? : "+ isEqual  );

        Arrays.fill(copyArray, 10);
        System.out.println("Kopyalanan dizinin 10 ile doldurulmuş hali : " + Arrays.toString(copyArray));
    }
}
