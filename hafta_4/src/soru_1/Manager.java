package soru_1;

import soru_1.Employee;

public class Manager extends Employee {

    private int teamSize;

    public Manager(int id, String firstName, String lastName, double salary, String department, int teamSize) {
        super(id, firstName, lastName, salary, department);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus(){
        return getSalary()*0.2;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size : " + getTeamSize());
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
