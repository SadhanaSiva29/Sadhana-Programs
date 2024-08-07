package inheritance;

public class Employee {
    private String name;
    private int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    Employee(){}
    @Override
    public String toString() {
        return "Employee Details:\nName: "+name+"\nSalary: "+salary;
    }
}
