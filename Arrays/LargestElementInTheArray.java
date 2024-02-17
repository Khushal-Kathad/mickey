package Arrays;

public class LargestElementInTheArray {

    // Time complexity is O(n) and it is optimal
    
    static int largestElement(int[] arr, int n) {
        int largest=arr[0];

        for (int i = 1; i < n; i++) {
            if (largest<arr[i]) {
                largest=arr[i];
            }
        }
        return largest;
    }
    
    
    
    public static void main(String[] args) {
        int [] array={9,45,-36,27,89};
        int n=array.length;
        int l= largestElement(array, n);
        System.out.println(l);
    }
}
