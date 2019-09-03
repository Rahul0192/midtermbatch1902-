package problems;
/**
 *If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
 * Palindrome. So write java code to check if a given String is Palindrome or not.
 *
 **/

public class Palindrome {
    public static void main(String[] args) {
        String palindrome = "level";
        char[] x = palindrome.toCharArray();
        int size = x.length;
        char[] find = new char[size];
        int i = 0;
        while (i != size) {
            find[size - 1 - i] = x[i];

            ++i;


        }
            while (i != size) {
                if (find[i] != x[i]) {
                    System.out.println("This is not palindmore");
                    System.exit(0);
                } else {
                    ++i;

                }
            }
        System.out.println("This is palindmore");
        }
    }