package inheritance;

public class Manager extends Employee {
    private String name;
    private double salary;
    public Manager(String name,double salary) {
        this.name=name;
        this.salary=salary;
//        System.out.println("Name: " + name + "\nSalary: " + salary + "\nDepartment: " + department);

    }
    @Override
    public String toString() {
        return "\nManager Details:\nName: "+name+"\nSalary: "+salary;

    }
}
class Main1{
    public static void main(String[] args) {
        Manager manager=new Manager("Sivakumar",500000);
        Employee employee=new Employee("Sadhana",500000);
        System.out.println(employee);
        System.out.println(manager);

    }
}
