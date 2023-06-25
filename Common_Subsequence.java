public class Common_Subsequence {
    Boolean commonSubseq(String a, String b) {
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == b.charAt(i)) {
                    return true;
                }
            }
        }
        return false;
    }
}
