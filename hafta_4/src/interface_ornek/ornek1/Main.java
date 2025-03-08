package interface_ornek.ornek1;

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        sedan.start();
        sedan.drive();
        sedan.stop();

        System.out.println("--------------");

        Car suv = new Suv();
        suv.start();
        suv.drive();
        suv.stop();
    }
}
