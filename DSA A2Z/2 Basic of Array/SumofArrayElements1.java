public class SumofArrayElements1 {
    public static void main(String[] args) {

        int array[] = {1, 2, 3};
        int n = array.length;
        int c = 0;

        for(int i = 0; i < n; i++) {
            c = c + array[i];
        }

        System.out.println("the sum of element of array is " + c);
    }
}