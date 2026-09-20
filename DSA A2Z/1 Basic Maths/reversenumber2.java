import java.util.Scanner;
public class reversenumber2 {
    public static void main(String[] args){
        System.out.println("Enter the number ");
        Scanner cin= new Scanner(System.in);

        int n;
        int l=0;
        int neew=0;
        n=cin.nextInt();
        while(n>0){
            l=n%10;
            n=n/10;    
            neew=(neew*10)+l;

        }
        System.out.println("reverse number is "+neew);

    }
}
