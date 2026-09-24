package Java.Loops.whileLoop;

import java.util.Scanner;

public class printnumoneton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        // for(int i = 1; i <= n; i++) {
        // System.out.print(i + " ");
        // }

    }
}
