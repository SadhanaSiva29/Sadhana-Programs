package collectiontask;

import java.util.ArrayList;

public class IteratorTask {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
        for (int i = 0; i < 10; i++ ){
            System.out.println(i);
        }
    }
}
