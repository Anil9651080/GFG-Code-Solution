public class Number_of_Subarrays_of_0s {
    long no_of_subarrays(int N, int[] arr) {
        long count = 0;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                count++;
            } else {
                ans += (count * (count + 1)) / 2;
                count = 0;
            }
        }
        ans += (count * (count + 1)) / 2;
        return ans;
    }
}
