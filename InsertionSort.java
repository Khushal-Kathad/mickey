import java.util.Arrays;

public class InsertionSort {
   
   
   private static void sort(int[] arr){
        int n=arr.length;
        for (int i = 0; i <= n-1; i++) {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]) {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        
        }
        System.out.println(Arrays.toString(arr));
   }
   
    public static void main(String[] args) {
        int[] arr={4,58,8,45,54,2};
        sort(arr);
    }
}
