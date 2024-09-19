package collectiontask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTask5 {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(4);
        Set<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(2);
        if(setA.equals(setB))
            System.out.println("Equal");
        else System.out.println("Not Equal");
        setA.retainAll(setB);
        System.out.println(setA);
    }
}
