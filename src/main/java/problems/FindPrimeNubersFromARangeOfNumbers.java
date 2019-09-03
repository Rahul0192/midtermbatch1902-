package problems;

import java.util.Scanner;

public class FindPrimeNubersFromARangeOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int ad= scanner.nextInt();
        if (connect(ad)) {
            System.out.println(ad+" "+ "this is prime number");
        }
        else {
            System.out.println(ad+" "+ "this is not");
        }
        }
        public static boolean connect(int n) {

            if (n <= 1) {
                return false;
            }

            for (int i = 2; i < Math.abs(n); i++) {
                if (n%i==0){
                    return false;
                }
            }
            return true;
        }
        }
