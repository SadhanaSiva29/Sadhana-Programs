package conflicts;

public class Conflict1 {
    public String department;
    Conflict1(String department){
        this.department = department;
    }

    @Override
    public String toString() {
        return "department: "+department;
    }

    public static void main(String[] args) {
        Conflict1 conflict1 = new Conflict1("BCCA");
        System.out.println(conflict1);
    }
}
