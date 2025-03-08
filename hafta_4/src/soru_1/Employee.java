package soru_1;

public abstract class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private String department;

    public Employee(int id, String firstName, String lastName, double salary, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public double calculateBonus(){
        return 0;
    }

    public void displayInfo(){
        System.out.println("ID : " + getId());
        System.out.println("Name : " + getFirstName() +" " + getLastName());
        System.out.println("Salary : " + getSalary());
        System.out.println("Department : " + getDepartment());
        System.out.println("Bonus : " + calculateBonus());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
