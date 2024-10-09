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
    public String jobTitle;
    public String department;
    public String managerId;
    public String dateOfJoining;
    public String employmentStatus;
    public double salary;
    public String workLocation;
    public String emergencyContact;
    public String skills;
    public String education;
    public String certification;
    public String performanceReview;

    public Employee1(double salary, String workLocation, String employmentStatus, String dateOfJoining,
                     String managerId, String department, String jobTitle, Address address,
                     String phoneNo, String emailAdd, String gender, String dob, String lastName,
                     String firstName, String employeeID, String emergencyContact,
                     String skills, String education, String certification, String performanceReview) {
        this.salary = salary;
        this.workLocation = workLocation;
        this.employmentStatus = employmentStatus;
        this.dateOfJoining = dateOfJoining;
        this.managerId = managerId;
        this.department = department;
        this.jobTitle = jobTitle;
        this.address = address;
        this.phoneNo = phoneNo;
        this.emailAdd = emailAdd;
        this.gender = gender;
        this.dob = dob;
        this.lastName = lastName;
        this.firstName = firstName;
        this.employeeID = employeeID;
        this.skills = skills;
        this.emergencyContact = emergencyContact;
        this.education = education;
        this.certification = certification;
        this.performanceReview = performanceReview;
    }
    private String panNumber;
    private String aadhaarNumber;
    private String bankAccountDetails;

    public String getBankAccountDetails() {
        return bankAccountDetails;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public void setBankAccountDetails(String bankAccountDetails) {
        this.bankAccountDetails = bankAccountDetails;
    }

    @Override
    public String toString() {
        return "EMPLOYEE\n" +
                "employeeID: " + employeeID +
                "\nfirstName: " + firstName +
                "\nlastName: " + lastName +
                "\ndob: " + dob +
                "\ngender: " + gender +
                "\nemailAdd: " + emailAdd +
                "\nphoneNo: " + phoneNo +
                "\naddress: " + address +
                "\njobTitle: " + jobTitle +
                "\ndepartment: " + department +
                "\nmanagerId: " + managerId +
                "\ndateOfJoining: " + dateOfJoining +
                "\nemploymentStatus: " + employmentStatus +
                "\nsalary: " + salary +
                "\nworkLocation: " + workLocation ;
    }

    public static void main(String[] args) {
        Address address1 = new Address("No.3, Nehru road","Indhira nagar","Kanchipuram",
                 "Tamil Nadu","600 003");
        Employee1 createEmployee = new Employee1(5000000.0,"Remote","full-time",
                "29/9/2004","C23005","Frontend",
                "Lead",address1,"9034568047","saranBanumathi@gmail.com",
                "Male","15/08/2003","Saran","Bhanumathi","C23005","90987684457","Critical thinking","BCA","Data Analytics","-");
        System.out.println(createEmployee);
        createEmployee.setEmployeeID("C2301");
        createEmployee.setBankAccountDetails("hdfc");
        createEmployee.setAadhaarNumber("7347683218465746");
        createEmployee.setPanNumber("PS7889");
        System.out.println("aadhar number: "+createEmployee.getAadhaarNumber());
        System.out.println("pan number: "+createEmployee.getPanNumber());
        System.out.println("bank details: "+createEmployee.getBankAccountDetails());
        System.out.println("employee id: "+createEmployee.getEmployeeID());
    }
}
