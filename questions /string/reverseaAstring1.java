
// THIS CODE IS ONLY FOR PRINT 

// public class reverseaAstring1 {
//     public static void main(String[] args){
//         String str = "Hello World";
//         int size = str.length();

//         for(int i=size-1;i>=0;i--){
//             System.out.print(str.charAt(i));
//         }
    
//     }
// }


// and this is for reverse a string 
public class reverseaAstring1 {
    public static void main(String[] args){
        System.out.println("working");
        String shan="my name is mohd shan";
        String rev="";
        char  ch;


        for(int i=0;i<shan.length();i++){
            ch= shan.charAt(i);
            rev=ch+rev;
          //  rev=rev+ch;
        }
        System.out.println(rev);


    }
}