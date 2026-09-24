public class IncomeTax {
    public static void main(String[] args) {

        int income = 700000;

        if (income <= 250000) {
            System.out.println("No tax");
        }
        else if (income <= 500000) {
            System.out.println("Tax = 5%");
        }
        else if (income <= 1000000) {
            System.out.println("Tax = 20%");
        }
        else {
            System.out.println("Tax = 30%");
        }
    }
}