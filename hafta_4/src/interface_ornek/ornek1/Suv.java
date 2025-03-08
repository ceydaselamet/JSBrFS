package interface_ornek.ornek1;

public class Suv implements Car{
    @Override
    public void start() {
        System.out.println("SUV araba çalıştırılıyor");
    }

    @Override
    public void stop() {
        System.out.println("SUV araba durduruluyor");
    }

    @Override
    public void drive() {
        System.out.println("SUV araba sürülüyor");
    }
}
