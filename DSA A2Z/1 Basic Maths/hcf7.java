
// broot force 
// eculideal hcf(a,b)=hcf(a-b,b)

import java.util.Scanner;

public class hcf7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();

        int hcf = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {

            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF = " + hcf);
    }
}