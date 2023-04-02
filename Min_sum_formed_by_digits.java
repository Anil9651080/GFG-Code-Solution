import java.util.Arrays;

public class Min_sum_formed_by_digits {

    public static long minSum(int arr[], int n) {
        Arrays.sort(arr);
        long sum1 = 0;
        long sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum1 = sum1 * 10 + arr[i];
            } else {
                sum2 = sum2 * 10 + arr[i];
            }
        }
        return sum1 + sum2;
    }

}
