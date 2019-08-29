package problems;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
//Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
//same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY"
public class Anagram {

    public static void main(String[] args) {
        String x = "State";
        String y = "Taste";
        x=x.toLowerCase();
        y=y.toLowerCase();

        char [] a = x.toCharArray();
        char [] b = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        Boolean compare = Arrays.equals(a, b);
        if (compare== true) {
            System.out.println("This is Anagram");
        } else {
            System.out.println("This is not an example of an Arrays");

        }
    }
}