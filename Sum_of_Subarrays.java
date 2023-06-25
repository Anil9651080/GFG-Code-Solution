public class Sum_of_Subarrays {
    public static long subarraySum(long a[], long n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (a[i] * (n - i) * (i + 1) % 1000000007);
        }
        return sum % 1000000007;
    }
}
