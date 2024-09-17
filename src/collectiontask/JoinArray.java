package collectiontask;

import java.util.ArrayList;

public class JoinArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            arrayList1.add(i);
        }
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            arrayList2.add(i);
        }
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
    }
}
