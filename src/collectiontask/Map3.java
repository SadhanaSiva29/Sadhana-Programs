package collectiontask;

import java.util.HashMap;

public class Map3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Akshaya", 5);
        map.put("Naveen", 6);
        map.put("Periyasamy", 7);
        map.put("Sadhana", 6);
        map.put("Shruthi", 8);
        System.out.println("HashMap: " + map);
        System.out.println(map.containsValue(6));
    }
}
