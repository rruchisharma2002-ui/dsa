public class funcOverloading {

    // 2 integers
    static int multiply(int a, int b) {
        return a * b;
    }

    // 3 integers
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // 2 floats
    static float multiply(float a, float b) {
        return a * b;
    }

    // 2 doubles
    static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println(multiply(2, 3));

        System.out.println(multiply(2, 3, 4));

        System.out.println(multiply(1.2f, 5.6f));

        System.out.println(multiply(1.2, 5.6));
    }
}