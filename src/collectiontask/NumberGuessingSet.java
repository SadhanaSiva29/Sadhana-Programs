package collectiontask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberGuessingSet {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        setA.addAll(Arrays.asList(new Integer[]{8, 9, 10, 11, 12, 13, 14, 15}));
        Set<Integer> setB = new HashSet<>();
        setB.addAll(Arrays.asList(new Integer[]{4, 5, 6, 7, 12, 13, 14, 15}));
        Set<Integer> setC = new HashSet<>();
        setC.addAll(Arrays.asList(new Integer[]{2, 3, 6, 7, 10, 11, 14, 15}));
        Set<Integer> setD = new HashSet<>();
        setD.addAll(Arrays.asList(new Integer[]{1, 3, 5, 7, 9, 11, 13, 15}));

        boolean yes = true;
        Set<Integer> commonElements = new HashSet<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter yes if the number you are thinking is in box A, else no:");
        String responseA = scanner.next();
        if (responseA.equalsIgnoreCase("yes")) {
            if (yes) {
                commonElements.addAll(setA);
                yes=false;
            }
        } else {
            commonElements.removeAll(setA);
        }

        System.out.println("Enter yes if the number you are thinking is in box B, else no:");

        String responseB = scanner.next();
        if (responseB.equalsIgnoreCase("yes")) {
            if (yes) {
                commonElements.addAll(setB);
                commonElements.removeAll(setA);
                yes=false;
            } else {
                commonElements.retainAll(setB);
            }
        } else {
            commonElements.removeAll(setB);
        }

        System.out.println("Enter yes if the number you are thinking is in box C, else no:");
        String responseC = scanner.next();
        if (responseC.equalsIgnoreCase("yes")) {
            if (yes) {
                commonElements.addAll(setC);
                commonElements.removeAll(setA);
                commonElements.removeAll(setB);
                yes=false;
            } else {
                commonElements.retainAll(setC);
            }
        } else {
            commonElements.removeAll(setC);
        }
        System.out.println("Enter yes if the number you are thinking is in box D, else no:");

        String responseD = scanner.next();
        if (responseD.equalsIgnoreCase("yes")) {
            if (yes) {
                commonElements.addAll(setD);
                commonElements.removeAll(setA);
                commonElements.removeAll(setB);
                commonElements.removeAll(setC);
                yes=false;
            } else {
                commonElements.retainAll(setD);
            }
        } else {
            commonElements.removeAll(setD);
        }
        System.out.println("The number you are thinking of :"+commonElements);
    }
}
