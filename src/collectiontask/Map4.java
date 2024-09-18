package collectiontask;

import java.util.Set;
import java.util.TreeMap;

public class Map4 {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Sadhu", "BCA");
        treeMap.put("Raju", "CA");
        treeMap.put("Achu", "A");
        treeMap.put("Shru", "-");
        Set<String> keys = treeMap.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
