package abstract_ornek.ornek1;

public class Suv extends Car{
    public Suv(int id, String brand, String model, int year) {
        super(id, brand, model, year);
    }

    @Override
    public void drive() {
        System.out.println("SUV araç sürülüyor.");
    }


}
