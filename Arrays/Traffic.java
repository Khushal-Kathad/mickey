

public class Traffic {

    public static int traffic(int n, int m, int[] vehicle) {
        int max = 0;
        int start = 0;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            if (vehicle[i] == 0) {
                zero++;
            }

            while (zero > m) {
                if (vehicle[start] == 0) {
                    zero--;
                }
                start++;
            }
            int l = i - start + 1;
            if (l > max) {
                max = l;
            }
            
        }
        return max;
    }

    public static void main(String[] args) {
        int[] lav={0, 1,0,0, 1,0};
        int l=traffic(6, 3, lav);

        System.out.println(l);
    }
}
