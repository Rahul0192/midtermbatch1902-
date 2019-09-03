package problems;

import java.util.Scanner;

/**
 * All leap years are divisible by 4 except century years are divisible by 4 and 400
 * If century years are divisible by 4 but not divisible by 400 that will not be leap year
 *
 * */
public class FindLeapyear {


    public static void main(String[] args) {
        findLeapyear(0);
    }

    private static void findLeapyear(int year) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter year");
        year=scanner.nextInt();

        if (year%4==0) {

            System.out.println("This is leapyar");
        }
else {
           System.out.println("This is not leapyear");

        }

    }
}
