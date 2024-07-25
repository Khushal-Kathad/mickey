

public class SecondLargestElementInArray {

    // Time Complexity : O(n)


    public static int[] getSecondOrderElements(int n, int[] a) {
        int largest = a[0];
        int smallest = Integer.MAX_VALUE;
        int second_largest = -1;
        int second_smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (largest < a[i]) {
                largest = a[i];
            }
            if (smallest > a[i]) {
                smallest = a[i];
            }
        }

        for (int i = 0; i < n; i++) {

            if (a[i] > second_largest && a[i] != largest) {
                second_largest = a[i];
            }
            if (a[i] < second_smallest && a[i] != smallest) {
                second_smallest = a[i];
            }
        }

        return new int[] { second_largest, second_smallest };

    }
    
    public static void main(String[] args) {
        int n = 5;
        int[] arr={1,2,3,4,5};

        int[] l=getSecondOrderElements(n, arr);
        
        for (int i : l) {
            System.out.print(i + " ");
        }
    }
}
