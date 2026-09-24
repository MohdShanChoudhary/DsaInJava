import java.util.Scanner;
public class palindrome3 {
    public  static void main (String[] args){
        System.out.println("enter the number ");
        Scanner cin= new Scanner(System.in);
        int n=cin.nextInt();
        int d=n;
        int l=0;
        int nn=0;
        while(n>0){
            l=n%10;
            n=n/10;
            nn=(nn*10)+l;


        }
        if(d==nn){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
    }
}
