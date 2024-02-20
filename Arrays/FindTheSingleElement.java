package Arrays;

public class FindTheSingleElement {
    
    public static int getSingleElement(int[] arr) {
        int xor=0;
        
        for (int i = 0; i < arr.length; i++) {
            xor=xor^arr[i];
        }
        return xor;
    }



    public static void main(String[] args) {
        int[] lav={1, 1, 2, 3, 3, 4, 4};
        int l= getSingleElement(lav);

        System.out.println(l);
    }
}
