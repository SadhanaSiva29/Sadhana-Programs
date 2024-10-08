package employeejdbc;

import java.util.Date;

public class CreateEmployee {
    public String employeeID;
    public String firstName;
    public String lastName;
    public Date dob;
    public String gender;
    public String emailAdd;
    public String phoneNo;
    public String address;
    public
    CreateEmployee(String employeeID, String firstName, String lastName, Date dob, String gender, String emailAdd,
                                 String phoneNo, String address){
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.emailAdd = emailAdd;
        this.phoneNo = phoneNo;
        this.address = address;
    }
}
