import java.util.Scanner;
public class countinterger1 {
    public static void main(String[] args ){
        System.out.println("Enter the no.");
        Scanner cin =new Scanner(System.in);
        int da=cin.nextInt();
        int l;
        int count=0;
        while(da>0){
            l=da%10;
            da=da/10;

            count++;
        }

        System.out.println(count);

    }
}
