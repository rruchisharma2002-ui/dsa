public class practice {
    public static void main(String[] args) {

        int age = 20;
        int marks = 75;
        int number = 7;

        // 1. Age check
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // 2. Even / Odd
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // 3. Grade
        if (marks >= 90) {
            System.out.println("A+");
        }
        else if (marks >= 80) {
            System.out.println("A");
        }
        else if (marks >= 70) {
            System.out.println("B");
        }
        else if (marks >= 40) {
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }

        // 4. Ternary
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println(result);

        // 5. Logical AND
        if (age >= 18 && marks >= 40) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        // 6. Logical OR
        if (number == 5 || number == 7) {
            System.out.println("Number is 5 or 7");
        }

        // 7. Switch
        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("Add");
                break;

            case 2:
                System.out.println("Subtract");
                break;

            case 3:
                System.out.println("Multiply");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}