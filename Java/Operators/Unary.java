package Java.Operators;

public class Unary {
    
    public static void main(String[] args) {

        int a = 5;

        // Unary plus
        System.out.println(+a);     // 5

        // Unary minus
        System.out.println(-a);     // -5

        // Increment
        a++;
        System.out.println(a);      // 6

        // Decrement
        a--;
        System.out.println(a);      // 5

        // Logical NOT
        boolean b = true;
        System.out.println(!b);     // false
    }
}
