package DistanceFriends;

public class Contact {
    String name;
    int phoneNo;
    String emailId;

    Contact(String name, int phoneNo, String emailId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
    }

    public void display() {
        System.out.println("Name: " + name + "\nEmail: " + emailId + "\nPhone No: " + phoneNo);
    }

}
