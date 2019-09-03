package problems;

public class FindFactorials {
    /**
     * factorials of n n! = 1 * 2 * 3 * ......* n
     */
    public static void main(String[] args) {

        int number = 5;
        int fact = 1;
        int i;
      for (  i = 1; i <= number; i++) {
          fact = fact * i;
          System.out.println("Factorials " + number + " is " + fact);

      }


    }
}