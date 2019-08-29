package problems;

import java.util.ArrayList;
import java.util.List;
/**
 * Write a function to find fibonacciSerie of 100
 * */
public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeries(100);
    }

    private static void fibonacciSeries(int n) {
        int  a, b;
        a = 0;
        b = 1;

       while (n<= 100) {
        n=a+b;
        a=b;
        b=n;


        System.out.print(n +" ,");

    }
}

}