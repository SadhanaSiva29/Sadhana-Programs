package DistanceFriends;

public class Employee extends Company {
    String designation;
    double salary;

    Employee(String name, int phoneNo, String emailId, int gst, int establishedYear, String designation, double salary) {
        super(name, phoneNo, emailId, gst, establishedYear);
        this.designation = designation;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name + "\nEmail: " + emailId + "\nPhone No: " + phoneNo + "\nGST: " + gst +
                "\nEstablished Year: " + establishedYear + "\nDesignation: " + designation + "\nSalary: "+salary);
    }
}
