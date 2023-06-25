public class Find_largest_word_in_dictionary {
    static String findLongestWord(String S, List<String> d) {
        int max = Integer.MIN_VALUE;
        Collections.sort(d);
        String output = "";
        for (String word : d) {
            if (check(word, S)) {
                if (word.length() > max) {
                    max = word.length();
                    output = word;
                }
            }
        }
        return output;
    }

    static boolean check(String word, String str) {
        int n = word.length();
        int l = str.length();
        int p = 0;
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == word.charAt(p))
                p++;
            if (p == n) {
                return true;
            }
        }
        return false;
    }
}
