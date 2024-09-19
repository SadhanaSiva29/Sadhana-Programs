package collectiontask;

import java.util.HashSet;

public class SetTask3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Sadhana");
        set.add("Periyasamy");
        set.add("Shruthi");
        set.add("Akshaya");
        set.add("Naveen");
        System.out.println("HashSet: " + set);
        HashSet cloned_set = new HashSet();
        cloned_set = (HashSet)set.clone();
        System.out.println("The new set: " + cloned_set);
    }
}
