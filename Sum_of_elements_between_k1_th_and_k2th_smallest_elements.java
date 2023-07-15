import java.util.Arrays;

public class Sum_of_elements_between_k1_th_and_k2th_smallest_elements {
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2) {
        long sum = 0;
        Arrays.sort(A);
        for (int i = (int) K1; i < K2 - 1; i++) {
            sum += A[i];
        }
        return sum;

    }
}
