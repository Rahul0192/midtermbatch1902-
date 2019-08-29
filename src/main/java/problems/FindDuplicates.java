package problems;

import java.util.*;

public class FindDuplicates {

    /**
     * Write Code To Filter Duplicate Elements From An Array?
     * */


    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 4, 5, 6, 7, 7};

        HashMap<Integer, Integer> obj = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (obj.containsKey(array[i])) {
                obj.put(array[i], obj.get(array[i] + 1));

            } else {
                obj.put(array[i], 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> connect = obj.entrySet();
        for (Map.Entry<Integer, Integer> cool : connect) {
            if (cool.getValue()> 1){
                System.out.println(cool.getKey());
            }

        }
    }

        }




