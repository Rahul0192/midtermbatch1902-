package problems;

public class InvertString {

    /**
     * Invert a String without using String default reverse() method
     */


    public static void main(String[] args) {

        String java = "Hello world";
        char[] x = java.toCharArray();
        int size = x.length;
        char[] find=new char[size];
        int i = 0;
        while (i != size) {
            find[size-1-i]=x[i];
            i++;


        }
        System.out.println(x);
        System.out.println(find);
    }
}