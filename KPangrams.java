public class KPangrams {
    boolean kPangram(String str, int k) {
        str = str.replace(" ", "");
        int n = str.length();
        if (str.length() < 26) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char temp = str.charAt(i);
            hm.put(temp, 1);
        }
        int temp = 26 - hm.size();
        if (k >= temp) {
            return true;
        }
        return false;
    }
}
