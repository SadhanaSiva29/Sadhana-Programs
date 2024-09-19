package collectiontask;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;

public class Map5 {
    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Sadhu", 1);
        treeMap.put("Raju", 2);
        treeMap.put("Achu", 3);
        treeMap.put("Shru", 4);
        System.out.println("Last key: "+ treeMap.lastKey());
        System.out.println("First key: "+treeMap.firstKey());
    }
}
