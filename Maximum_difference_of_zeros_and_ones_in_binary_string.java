public class Maximum_difference_of_zeros_and_ones_in_binary_string {
    int maxSubstring(String S) {
///done 
        int max = -1;
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            count += (S.charAt(i) == '1' ? -1 : 1);
            max = Math.max(max, count);
            if (count < 0)
                count = 0;
        }
        return max;
    }
}
