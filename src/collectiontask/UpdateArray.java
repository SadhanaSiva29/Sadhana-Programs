package collectiontask;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;


public class UpdateArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(10);
        UpdateArray updateArray = new UpdateArray();
        Iterator itr = arrayList.iterator();
        System.out.println("Enter the value in which replacement is required:");
        int value = scanner.nextInt();
        System.out.println("Enter the value for replacing:");
        int replace= scanner.nextInt();
       int i= arrayList.indexOf(value);
       try {
           arrayList.set(i, replace);
           System.out.println(arrayList);
       }
       catch (IndexOutOfBoundsException e){
           System.out.println("Enter the correct value that has to be replaced.");
       }
    }

}
