package Sorting;

import java.util.Arrays;

public class SelectionSort {

    // Time Complexity : O(n^2) for Best Average and Worst case
    // Space Complexity : O(1)
    
    private static void sort(int[] arr){
        int n=arr.length;
        for (int i = 0; i <= n-2; i++) {
            int min=i;

            for (int j = i; j <= n-1; j++) {
                if (arr[j]<arr[min]) {
                    min=j;
                }
            }
            // Swap the found minimum element with the first element
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={4,3,2,6,7,44};
        sort(arr);
    }
    
}