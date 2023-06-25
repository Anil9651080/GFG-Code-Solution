public class Sum_of_bit_differences {
    long sumBitDifferences(int[] arr, int n) {
        long ans = 0;
        for (int i = 0; i < 32; i++) {
            long ones = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) != 0) {
                    ones++;
                }
            }
            ans += (ones) * (n - ones);
        }
        return 2 * ans;
    }
}
