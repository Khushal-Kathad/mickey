package Arrays;

public class CheckSortedArray {
    
    public static int isSorted(int n, int[] a) {
        
        for (int i = 1; i < n; i++) {
            if (a[i]<a[i-1]) {
                return 0;                
            }else{
                continue;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int n=4;
        int[] a={1,2,10,4,5};

        int l=isSorted(n, a);
        System.out.println(l);
    }
}
