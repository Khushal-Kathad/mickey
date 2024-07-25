

public class MoveZerostoEnd {


    public static int[] moveZeros(int n, int[] a) {
            int k=-1;

            for (int i = 0; i < n; i++) {
                if (a[i]==0) {
                    k=i;
                    break;
                }
            }
            for (int i = k+1; i < n; i++) {
                if (a[i]!=0 && k!=-1){
                    int temp=a[i];
                    a[i]=a[k];
                    a[k]=temp;
                    k++;
                }
            }
            return a;
    }

    public static void main(String[] args) {
        int[] a={1, 2, 0, 0, 2, 3};
        int[] l=moveZeros(6, a);
        for (int i : l) {
            System.out.print(i+" ");
        }
    }   
    
}
