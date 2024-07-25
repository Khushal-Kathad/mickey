import java.util.HashMap;
import java.util.Map;


public class BTLongestSubarrayWithSumK {

    

    public static int longestSubarrayWithSumK(int[] a, long k) {
        Map<Integer, Integer> map = new HashMap<>() ;
        int sum=0;
        int maxlen=0;


        for (int i = 0; i < a.length; i++) {
            sum +=a[i];

            if (sum == k) {
                maxlen = Math.max(maxlen, i+1);
            }

            long rem=sum-k;

            if (map.containsKey(rem)) {
                int len = i-map.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, 1);
            }

        }

        return maxlen;
    }

    public static void main(String[] args) {
        
    }
}