import java.util.ArrayList;
import java.util.List;

public class soru_9 {
    public static void main(String[] args) {
        //get(int index): Listedeki istenilen indexteki öğeyi getirir.
        //set(int index, E element): Listenin istenilen indexindeki öğeyi, girilen element ile değiştirir.
        //remove(int i): Silinmek istenilen indeksteki veriyi siler.
        //remove(E element): Öğeyi doğrudan siler.
        //clear(): Liste içerisini tamamen siler.
        //size(): Liste içerisindeki eleman sayısını döndürür.

        List<String> countries = new ArrayList<>();
        countries.add("Türkiye");
        countries.add("Germany");
        countries.add("Poland");
        countries.add("Malta");
        countries.add("Denmark");
        countries.add("Spain");

        System.out.println("Ülkeler : " + countries);
        System.out.println("Listedeki ülke sayısı : " + countries.size());
        System.out.println("4. indeksteki ülke: " + countries.get(4));

        countries.set(4, "Swedish");
        System.out.println("4. indeksteki yeni ülke: " + countries.get(4));

        System.out.println("Silinen ülke : Spain ");
        countries.remove("Spain"); // index olarak : countries.remove(5);
        System.out.println("Yeni liste : " + countries);

        countries.clear();

        System.out.println("Yeni liste : " + countries);


    }
}
