package collectiontask;

import java.util.HashSet;
import java.util.Scanner;

public class AppendEnd {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(6);
        System.out.println(hashSet);
        int input = scanner.nextInt();
        System.out.println("Updated set: ");
        if (input > 6) {
            hashSet.add(input);
            System.out.println(hashSet);
        }
    }
}
