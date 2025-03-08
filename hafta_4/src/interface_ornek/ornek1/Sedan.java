package interface_ornek.ornek1;

public class Sedan implements Car{
    @Override
    public void start() {
        System.out.println("Sedan araba çalıştırılıyor");
    }

    @Override
    public void stop() {
        System.out.println("Sedan araba durduruluyor");
    }

    @Override
    public void drive() {
        System.out.println("Sedan araba sürülüyor.");
    }
}
