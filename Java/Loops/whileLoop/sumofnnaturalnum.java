package Java.Loops.whileLoop;

import java.util.Scanner;

public class sumofnnaturalnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }

        // for(int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}