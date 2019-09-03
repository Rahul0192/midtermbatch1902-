package problems;

import java.util.Scanner;

public class GenerateMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
        int obj=scanner.nextInt();
        for (int i=1;i<=10;i++){
            int multipile= obj*i;
            System.out.println(obj+" * "+i+" ="+multipile);


        }
            }
}
