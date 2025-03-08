package abstract_ornek.ornek1;

public abstract class Car {
    private int id;
    private String brand;
    private String model;
    private int year;

    public Car(int id,String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void drive();

    public void displayInfo(){
        System.out.println("ID : " + getId());
        System.out.println("Brand : " + getBrand());
        System.out.println("Model : " + getModel());
        System.out.println("Year : " + getYear());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
