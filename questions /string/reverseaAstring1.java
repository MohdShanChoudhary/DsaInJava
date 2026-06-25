

public class reverseaAstring1 {
    public static void main(String[] args){
        String str = "Hello World";
        int size = str.length();

        for(int i=size-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    
    }
}
