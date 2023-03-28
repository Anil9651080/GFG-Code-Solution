import java.util.Arrays;

class Maximize_sum_after_K_negations {

    public static long maximizeSum(long a[], int n, int k) {
        int sum = 0;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] < 0 && k > 0) {
                a[i] = Math.abs(a[i]);
                k--;
            }
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        if (k % 2 == 0) {
            return sum;
        } else {
            return (sum - a[0] - a[0]);
            // return sum;
        }

    }
}