public class Nth_Fibonacci_Number {
    static int nthFibonacci(int n) {
        // code here

        int prev2 = 0;
        int prev = 1;
        int mod = 1000000007;

        for (int i = 2; i <= n; i++) {
            int cur = ((prev) % mod + prev2) % mod;
            prev2 = prev;
            prev = cur;
        }
        return prev;
    }
}
