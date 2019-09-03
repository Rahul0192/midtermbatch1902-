package datastructure;


import java.util.HashMap;

public class MapDemo {

    /**
     * @author Jahidul Islam
     * Create a Map reference variable and store information as you like
     * Show me all possible retrieval process
     * Store map in DB
     *
     * */
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("St1", "90");
        hashMap.put("St2", "80");
        hashMap.put("St3", "65");
        hashMap.put("St4", "20");
        hashMap.put("St5", "78");
        System.out.println(hashMap);
        hashMap.replace("St1", "90", "98");

        System.out.println(hashMap);

    }
}
