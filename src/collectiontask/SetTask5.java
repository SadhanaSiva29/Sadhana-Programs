package collectiontask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTask5 {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        setA.addAll(Arrays.asList(new Integer[]{8, 9, 10, 11, 12, 13, 14, 15}));
        Set<Integer> setB = new HashSet<>();
        setB.addAll(Arrays.asList(new Integer[]{4, 5, 6, 7, 12, 13, 14, 15}));
        if(setA.equals(setB))
            System.out.println("Equal");
        else System.out.println("Not Equal");
        setA.retainAll(setB);
        System.out.println(setA);
    }
}
