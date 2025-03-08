package abstract_ornek.ornek1;

public class Sedan  extends Car{

    public Sedan(int id, String brand, String model, int year) {
        super(id, brand, model, year);
    }

    @Override
    public void drive() {
        System.out.println("Sedan araç sürülüyor.");
    }
}
