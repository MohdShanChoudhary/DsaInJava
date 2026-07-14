
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
        String shan="abcd";
        String rev="";
        char  ch;


        for(int i=0;i<shan.length();i++){
            ch= shan.charAt(i);            // ch=shan[i]; ya  gakat hoga   / or hum c

            rev=ch+rev;     //  rev=rev+ch; ya galat hoga 
        
        }
        System.out.println(rev);


    }
}


//and this code  is for if we have a char array 
// class Solution {
//     public void reverseString(char[] s) {

//         String rev = "";

//         for (int i = 0; i < s.length; i++) {
//             char ch = s[i];
//             rev = ch + rev;
//         }

//         // rev ke characters wapas array me daalna
//         for (int i = 0; i < s.length; i++) {
//             s[i] = rev.charAt(i);
//         }
//     }
// }