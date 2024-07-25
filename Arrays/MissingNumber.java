

public class MissingNumber {
    
    public static int missingNumber(int[] nums) {

        int n = nums.length;

        int k = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return (k - sum);
    }

    public static void main(String[] args) {
        int[] a={3,0,1};
        System.out.println(missingNumber(a));
    }
}
