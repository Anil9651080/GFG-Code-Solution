class Longest_Distinct_characters_in_string {
    static int longestSubstrDistinctChars(String S) {
        int maxlen = 0;
        int index = 0;

        int[] arr = new int[26];
        for (int i = 0; i < S.length(); i++) {
            int ch = S.charAt(i) - 'a';
            arr[ch]++;
            while (arr[ch] == 2) {
                int cur = S.charAt(index) - 'a';
                arr[cur]--;
                index++;
            }
            maxlen = Math.max(maxlen, i - index + 1);
        }
        return maxlen;
    }
}