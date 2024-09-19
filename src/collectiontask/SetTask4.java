package collectiontask;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class SetTask4 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Hey");
        linkedHashSet.add("There!");
        linkedHashSet.add("Its me");
        String[] array = linkedHashSet.toArray(args);
        System.out.println("Array: " + Arrays.toString(array));
    }
}
