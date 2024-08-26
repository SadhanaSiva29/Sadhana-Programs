package DistanceFriends;

public class Company extends Contact {
    int gst;
    int establishedYear;

    Company(String name, int phoneNo, String emailId , int gst, int establishedYear) {
        super(name, phoneNo, emailId);
        this.gst=gst;
        this.establishedYear=establishedYear;
    }
    public void display(){
        System.out.println("Name: "+name+"\nEmail: "+emailId+"\nPhone No: "+phoneNo+ "\nGST: " + gst +
                "\nEstablished Year: " + establishedYear);
    }
}
//Company(){
//
//
//}
//
//Company(int gst, int establishedYear){
//
//    this.gst = gst;
//    this.establishedYear = establishedYear;
//}
//
//public Company getObjet(int gst, int establishedYear){
//
//    return new Company(gst,establishedYear);
//}
//
//
//
//public static void main(String[] args) {
//
//    Company company = new Company();
//
//    Company company1 = company.getObjet(445,2024);
//
//}