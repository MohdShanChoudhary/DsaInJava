public class Prifix1{
    public static void main (String[] args){
        int[] array={1,2,3,4,5,6};
        for(int i=1;i<array.length;i++){
            array[i]=array[i]+array[i-1];
        }
        System.out.println(array[2]);
     }
}

// this is the simple implimantation of it 