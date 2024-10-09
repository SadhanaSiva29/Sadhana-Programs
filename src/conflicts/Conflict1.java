package conflicts;

public class Conflict1 {
    public String name;
    Conflict1(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Conflict1{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Conflict1 conflict1 = new Conflict1("sadhana");
    }
}
