package DistanceFriends;

import java.time.LocalDate;

public class ContactMainClass {
    public static void main(String[] args) {
        System.out.println("Class Contact:");
        Contact contact = new Contact("Sadhana", 88675, "sa@123gmail.com");
        contact.display();
        System.out.println("\n-------------------------------\nPerson Class:");
        LocalDate dob = LocalDate.of(2004, 11, 29);
        Person person = new Person("Sadhana", 88245, "person@gmail.com", dob);
        System.out.println("Company Class:");
        person.display();
        System.out.println("Age: "+person.calculateAge(dob));
        System.out.println("\n-------------------------------\nEmployee Class:");
        Employee employee=new Employee("Sadhana", 88245, "person@gmail.com",12,
                2020,"Manager",300000);
        employee.display();
        System.out.println("------------------------------------\nContact and person: ");
        Contact contactPerson= new Person("Sadhana", 88245, "person@gmail.com", dob);
        contactPerson.display();

    }
}
