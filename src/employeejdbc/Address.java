package employeejdbc;

public class Address {
    public String addLine1;
    public String addLine2;
    public String city;
    public String state;
    public String pincode;
    public Address(String addLine1,String addLine2,String city,String state,String pincode){
        this.addLine1 = addLine1;
        this.addLine2 = addLine2;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return  "\nAddLine1=" + addLine1 +
                "\naddLine2=" + addLine2 +
                "\ncity=" + city + "\nstate="+state+
                "\npincode=" + pincode ;
    }
}
