package DistanceFriends;

import java.time.LocalDate;
import java.time.Period;


public class Person extends Contact {
    LocalDate dateOfBirth;

    Person(String name, int phoneNo, String emailId, LocalDate dateOfBirth) {
        super(name, phoneNo, emailId);
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge(LocalDate dateOfBirth) {
        Period period = Period.between(dateOfBirth, LocalDate.now());
        return period.getYears();
    }

    public void display() {
        System.out.println("Name: " + name + "\nEmail: " + emailId + "\nPhone No: " + phoneNo + "\nDate of Birth:" + dateOfBirth);
    }
}