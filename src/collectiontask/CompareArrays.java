package collectiontask;

import java.util.ArrayList;

public class CompareArrays {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            arrayList1.add(i);
        }
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            arrayList2.add(i);
        }
        if (arrayList1.equals(arrayList2) == true) {
            System.out.println(" Array List are equal");
        }
        else
        {
            System.out.println(" Array List are not equal");
        }
    }
}
