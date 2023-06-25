import java.util.HashSet;

public class Subarray_with_0_sum {
    static boolean findsum(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (set.contains(sum)) {
                return true;
            } else if (sum == 0) {
                return true;
            } else {
                set.add(sum);
            }
        }
        return false;
    }
}
