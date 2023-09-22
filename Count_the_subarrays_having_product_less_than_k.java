public class Count_the_subarrays_having_product_less_than_k {
    public long countSubArrayProductLessThanK(long a[], int n, long k) {
        long count = 0;

        for (int i = 0; i < n; i++) {
            long product = 1;

            for (int j = i; j < n; j++) {
                product *= a[j];
                if (product < k) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}
