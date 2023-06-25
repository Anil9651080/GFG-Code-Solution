public class Sum_of_all_substrings_of_a_number {
    public static long sumSubstrings(String s) {
        long sum = 0, prev = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            prev = prev * 10 + (i + 1) * digit;
            sum += prev;
        }
        return sum;
    }
}
