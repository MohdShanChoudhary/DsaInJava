
// a whole number greater than 1 that can only be divided evenly by 1 and itself
import java.util.Scanner;

public class prime6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = input.nextInt();

        if (n <= 1) {
            System.out.println("Not a prime");
            return;
        }

        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                count++;
            }
        }

        if (count == 1) {
            System.out.println("It is a prime");
        } else {
            System.out.println("Not a prime");
        }
    }
}