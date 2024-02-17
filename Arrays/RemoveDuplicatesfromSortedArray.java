package Arrays;

public class RemoveDuplicatesfromSortedArray {
    

    public static int removeDuplicates(int[] arr, int n) {
        int i=0;        
        for (int j = 1; j< n; j++) {
            if (arr[j]!=arr[i]) {
                arr[i+1]=arr[j];
                i++;
            
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int n=4;
        int [] arr={2,3,3,6};

        int l=removeDuplicates(arr, n);
        System.out.println("Length of the array after removing duplicates is "+l);
    }
}
