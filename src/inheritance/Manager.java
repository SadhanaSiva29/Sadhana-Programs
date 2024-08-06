package inheritance;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
        System.out.println("Name: " + name + "\nSalary: " + salary + "\nDepartment: " + department);
    }
}
class Main1{
    public static void main(String[] args) {
        Manager manager=new Manager("Sadhana",500000,"BCA");
    }
}
