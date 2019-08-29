package problems;

import apple.laf.JRSUIConstants;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
/*
 * Write a java program to find the duplicate words and their number of occurrences in the string.
 * Also Find the average length of the words.
 */
public class DuplicateWord {

    public static void main(String[] args) {
    dup();

    }

    public static void dup() {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String []  duolicate =st.split(" ");

        HashMap<String,Integer> map= new HashMap<>();
        for (String obj:duolicate) {
            if (map.containsKey(obj)){
                map.put(obj,map.get(obj)+1);
            }
            else {
                map.put(obj,1);
            }

        }
        // System.out.print(map);
        Set<String> set=map.keySet();
        for (String x:set) {
            System.out.println("word: "+x+" Repeated: "+map.get(x)+"Times");

        }

    }


        }