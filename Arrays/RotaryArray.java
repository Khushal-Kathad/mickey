

public class RotaryArray {

    public static void reverse(int[] arr,int start,int end){
        while (start<=end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }


    public static void rotateOptimal(int[] nums,int k,int n){
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);

        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        int[] temp=new int[k];
        int j=0;
        for(int i=n-1;i>=n-k;i--){
            temp[j]=nums[i];
            j++;
        }

        for(int i=n-k-1;i>=0;i--){
            nums[k+i]=nums[i];
        }
        int a=0;
        for(int i=k-1;i>=0;i--){
            nums[i]=temp[a];
            a++;
        }
    }

    public static void main(String[] args) {
        int k=3;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // rotate(arr, k);
        
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }

        rotateOptimal(arr, k, 7);
    }
}
