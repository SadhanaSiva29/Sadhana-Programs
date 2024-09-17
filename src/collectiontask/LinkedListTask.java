package collectiontask;

import java.util.LinkedList;

public class LinkedListTask {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add(0, "0");
        System.out.println(list);

    }
}


