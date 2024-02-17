package Sorting;

import java.util.Arrays;

public class QuickSort {

    // Time Complexity :  O(nlog(n)) in all cases, but can be up to O(n^2) if the pivot is chosen poorly.

    private static int partition(int[] arr,int low,int high){
        int i=low;
        int j=high;

        int pivot=low;

        while (i<j) {
            while (arr[i]<=arr[pivot] && i<=high-1) {
                i++;
            }
            while (arr[j]>arr[pivot] && j>=low-1) {
                j--;
            }
            if (i<j) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
            int temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;
        }
        return j;
    }

    private static void sort(int[] arr, int low,int high){
        if (low<high) {
            int  pi = partition(arr, low, high);
            sort(arr, low, pi -1 );
            sort(arr ,pi + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr={4 ,3, 8, 4, 6, 5};
        sort(arr, 0, arr.length-1);      
        System.out.println(Arrays.toString(arr));
  
    }
}
