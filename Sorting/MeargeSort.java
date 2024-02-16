package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MeargeSort {

    // Time Complexity : for each case O(nlogn)
    // follows the divide and conqure approach
    
    private static int[] mearge(int[] arr,int low ,int mid,int high){
        List<Integer> res = new ArrayList<>();

        int l=low;
        int r=mid+1;

        while (l<=mid && r<=high) {

            if (arr[l]<=arr[r]) {
                res.add(arr[l]);
                l++;
            }else{
                res.add(arr[r]);
                r++;
            }
            
        }
        while (l<=mid) {
            res.add(arr[l]);
            l++;
            
        }
        while (r<=high) {
            res.add(arr[r]);
            r++;
        }

        for (int i = low; i <=high; i++) {
            arr[i]=res.get(i-low);
        }
        return arr;
        
    }
    
    private static void MS(int[] arr,int l,int r){
        if (l==r) {
            return;
        }
        int mid=l+(r-l)/2;

        MS(arr, l, mid);
        MS(arr, mid+1, r);
        mearge(arr,l,mid,r);

    }
    
    
    public static void main(String[] args) {
        int[] arr={4,6,3,2,2,9,43,2};
        MS(arr, 0, 7);

    }
}
