package abstract_ornek.ornek1;

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan(1, "VOLKSWAGEN", "Passat", 2015);
        sedan.displayInfo();
        sedan.drive();

        System.out.println("---------------");

        Car suv = new Suv(2, "Mercedes-Benz", "G63", 2019);
        suv.displayInfo();
        suv.drive();
    }
}
