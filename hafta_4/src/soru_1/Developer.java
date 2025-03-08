package soru_1;

import soru_1.Employee;

public class Developer extends Employee {

    private String about;

    public Developer(int id, String firstName, String lastName, double salary, String department, String about) {
        super(id, firstName, lastName, salary, department);
        this.about = about;
    }

    @Override
    public double calculateBonus(){
        return getSalary()*0.1;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("About : " + getAbout());
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
