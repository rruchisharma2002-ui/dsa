package Java.Loops;

public class breakcontinue {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {

            if(i == 5) {
                continue;
            }

            if(i == 8) {
                break;
            }

            System.out.println(i);
        }

    }
}
//break    → poora loop band
//continue → sirf current iteration skip