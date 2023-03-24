
class Isomorphic_Strings {
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            if (map1[str1.charAt(i)] != map2[str2.charAt(i)]) {
                return false;
            }
            map1[str1.charAt(i)] = i + 1;
            map2[str2.charAt(i)] = i + 1;
        }
        return true;
    }
}