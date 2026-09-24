// Method 1
import java.util.Scanner;
// public class divisor5 {
//     public static void main(String[] args){
//         int n;
//         System.out.println("Enter the number ");
//         Scanner cin= new Scanner(System.in);
//         n=cin.nextInt();
//         int c=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 c++;
//             }
            
//         }
//         System.out.println(c);
//     }
// }




// method 2 - to print all the divisor 
public  class divisor5{
    public static void main (String[] args ){
         int  n;
         Scanner cin=new Scanner(System.in);
         n=cin.nextInt();
         for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i);
            }
            if(i != n / i){
                System.out.println(n/i);
            }
         }
    }
}