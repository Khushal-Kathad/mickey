package Sorting;

import java.util.Arrays;

public class BubbleSort {

    private static void sort(int[] arr){
        int n=arr.length;

        for (int i = n-1; i >=0; i--) {
            for (int j = 0; j <=i-1; j++) {
                if (arr[j]>arr[i]) {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = { 4, 3,44, 2, 6, 7 };
        sort(arr);
    }
    
}
