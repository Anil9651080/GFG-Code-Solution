
class SolutionLargest_number_with_given_sum {
    // Function to return the largest possible number of n digits
    // with sum equal to given sum.
    static String largestNumber(int n, int sum) {
        if (sum < 0 || n * 9 < sum) {
            return "-1";
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int digit = Math.min(9, sum);
            s.append(digit);
            sum -= digit;
        }
        return s.toString();
    }
}
