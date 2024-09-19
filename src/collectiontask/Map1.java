package collectiontask;

import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Akshaya", 5);
        map.put("Naveen", 6);
        map.put("Periyasamy", 7);
        System.out.println("Initial HashMap: " + map);
        map.put("Sadhana", 6);
        map.put("Naveen", 8);
        System.out.println("Updated HashMap: " + map);
    }
}

