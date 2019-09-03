package datastructure;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Jahidul Islam
 * Create HashSet and store data
 * Get the data from HashSet and print
 * Get the data from HashSet and insert it in db table
 *
 * */
public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> set= new HashSet<>();
            set.add("Rahul");
            set.add("joy");
            set.add("Nayem");
            set.add("Zahid");
          int i=0;
        for (i=0;i<set.size();i++);{
           // System.out.print(set);
            Iterator<String>iterator=set.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }





    }
}
