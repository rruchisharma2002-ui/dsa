public class funcOverloadUsingParams {

    // Sum of 2 numbers
    static int sum(int a, int b) {
        return a + b;
    }

    // Sum of 3 numbers
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(sum(10, 20));

        System.out.println(sum(10, 20, 30));
    }
}