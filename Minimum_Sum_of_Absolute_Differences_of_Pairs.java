import java.util.Arrays;

public class Minimum_Sum_of_Absolute_Differences_of_Pairs {
    long findMinSum(int[] A, int[] B, int N) {
        Arrays.sort(A);
        Arrays.sort(B);
        long count = 0;
        for (int i = 0; i < N; i++) {
            count = count + Math.abs(A[i] - B[i]);
        }
        return count;
    }
}
