import java.util.Scanner;
public class armstrom4 {
    public static void main(String[] args){
        int n;
        System.out.println("Enter the number ");
        Scanner cin =new Scanner(System.in);
        n=cin.nextInt();
        int cop=n;
        int l=0;
        int no=0;
        while(n>0){
            l=n%10;
            n=n/10;
            no=(l*l*l)+no;


        }
        if(no==cop){
            System.out.println("yes");

        }
        else{
            System.out.println("F");
        }
        
    }
}
