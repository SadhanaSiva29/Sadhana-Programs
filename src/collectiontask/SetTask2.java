package collectiontask;

import java.util.LinkedHashSet;

public class SetTask2 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        System.out.println(linkedHashSet);
        linkedHashSet.clear();
        System.out.println(linkedHashSet);
    }
}
