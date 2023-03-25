class Checkif_two_strings_are_k_anagrams_or_not {
    
    boolean areKAnagrams(String s1, String s2, int k) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        int change = 0;
        for (int i = 0; i < 26; i++) {
            change += Math.abs(arr[i]);
        }
        return (change / 2) <= k;
    }
}