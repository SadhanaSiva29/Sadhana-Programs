package collectiontask;

import java.util.HashSet;

public class SetTask6 {
    public static void main(String[] args) {
        HashSet<String> HashSet = new HashSet<>();
        HashSet.add("A");
        HashSet.add("B");
        HashSet.add("C");
        System.out.println(HashSet);
        HashSet.clear();
        System.out.println(HashSet);
    }
}
