public class  LengthofLastWord{
    public static void main(String[] args){
        System.out.println("working");
    String sh="mohammad shan chou ";
    char ch;
    int m=0;
    sh=sh.trim();       
    for(int i=sh.length()-1;i>=0;i--){
        ch=sh.charAt(i);
        if(ch!=' '){

        m++;
        }else{
            break;
        }
    }
    System.out.println(m);
    }
}
