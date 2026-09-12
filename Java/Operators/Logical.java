public class Logical {
    public static void main(String[] args) {

        int age = 20;
        boolean hasID = true;

        // && (AND)
        System.out.println(age >= 18 && hasID);
        
        // || (OR)
        System.out.println(age < 18 || hasID);

        // ! (NOT)
        System.out.println(!hasID);
    }
}