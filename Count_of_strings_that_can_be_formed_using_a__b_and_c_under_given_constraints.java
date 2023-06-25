public class Count_of_strings_that_can_be_formed_using_a__b_and_c_under_given_constraints {
    static long countStr(long n) {
        long ans = 0;

        ans = 1;
        ans += 2 * n;
        ans += n * (n - 1);
        ans += n * (n - 1) * (n - 2) / 2;
        ans += n * (n - 1) / 2;

        return ans;
    }
}
