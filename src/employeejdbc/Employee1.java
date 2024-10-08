package employeejdbc;

public class Employee1 {
    public String employeeID;
    public String firstName;
    public String lastName;
    public String dob;
    public String gender;
    public String emailAdd;
    public String phoneNo;
    public Address address;
    public Employee1(String employeeID, String firstName, String lastName, String dob, String gender, String emailAdd,
                     String phoneNo, Address address){
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.emailAdd = emailAdd;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nEmployee ID: "+ employeeID + "\nFirst name: "+firstName+"\nLast name: "+lastName+"\nDate of birth: "+dob+"\nEmail ID: "
                +employeeID +"\nPhone No.: "+phoneNo + "\nAddress: "+ address;
    }

    public static void main(String[] args) {
        Address address1 = new Address("No.3, Nehru road","Indhira nagar","Kanchipuram","600 003");
        Employee1 createEmployee = new Employee1("CS01","S","Sadhana",
                "29/9/2004","female","sdfga@gmail.com",
                "9023457384",address1);
        System.out.println(createEmployee);

    }
}
