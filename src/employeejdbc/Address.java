package employeejdbc;

public class Address {
    public String addLine1;
    public String addLine2;
    public String addLine3;
    public String pincode;
    public Address(String addLine1,String addLine2,String addLine3,String pincode){
        this.addLine1 = addLine1;
        this.addLine2 = addLine2;
        this.addLine3 = addLine3;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return  "\nAddLine1=" + addLine1 +
                "\naddLine2=" + addLine2 +
                "\naddLine3=" + addLine3 +
                "\npincode=" + pincode ;
    }
}
