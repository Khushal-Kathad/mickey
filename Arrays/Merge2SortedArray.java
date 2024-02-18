package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Merge2SortedArray {

    public static List<Integer> sortedArray(int[] a, int[] b) {
        // Write your code here
        int k = a.length;
        int l = b.length;

        List<Integer> res = new ArrayList<Integer>();

        int i = 0;
        int j = 0;

        while (i < k && j < l) {
            if (a[i] <= b[j]) {
                if (res.isEmpty() || !res.contains(a[i])) {
                    res.add(a[i]);
                }
                i++;
            } else {
                if (res.isEmpty() || !res.contains(b[j])) {
                    res.add(b[j]);
                }
                j++;
            }
        }
        while (i < k) {
            if (res.isEmpty() || !res.contains(a[i])) {
                res.add(a[i]);
            }
            i++;
        }
        while (j < l) {
            if (res.isEmpty() || !res.contains(b[j])) {
                res.add(b[j]);
            }
            j++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 6 };
        int[] b = { 2, 3, 5 };
        List<Integer> l = sortedArray(a, b);

        for (Integer integer : l) {
            System.out.println(integer + " ");
        }
    }
}
