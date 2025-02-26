import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cities = new ArrayList<>();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");
        cities.add("Antalya");
        cities.add("Kütahya");

        for(int i = 0; i< cities.size(); i++)
            cities.set(i, cities.get(i).toLowerCase());


        System.out.println("Lütfen şehrinizi giriniz: ");
        String city = scanner.nextLine();
        city = city.toLowerCase();

        if(cities.contains(city)) {
            int index = cities.indexOf(city);
            System.out.println(city + " şehri "+ index+ " indexinde mevcut.");
        }
        else
            System.out.println(city + " şehri listede yok.");

    }
}
