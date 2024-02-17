package Arrays;

import java.util.ArrayList;

public class LeftRotateArraybyKPlaces {
    
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        k=k%arr.size();
        int[] temp=new int[k];
        for (int i = 0; i < k; i++) {
            temp[i]=arr.get(i);
        }
        // Shift the remaining elements of array to one position ahead

        for (int i = k; i < arr.size(); i++) {
            res.add(arr.get(i));
        }

        for (int i = arr.size()-k; i < arr.size(); i++) {
            res.add(temp[i-(arr.size()-k)]);
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        ArrayList<Integer> l= rotateArray(arr, 3);

        for (Integer integer : l) {
            System.out.println(integer);
        }
    }
}
