package soru_1;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager(1, "Ayşe", "Demir", 80000, "Manager", 9);

        Developer developer = new Developer(2, "Ceyda", "Selamet",50000,"Software" ,"Backend Developer");

        manager.displayInfo();
        System.out.println("--------------");
        developer.displayInfo();
    }
}