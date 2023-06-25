public class Remaining_String {
    //done
    String printString(String S, char ch, int count) {
        if (count == 0) {
            return S;
        }
        int i = 0;
        int matchCount = 0;
        while (i < S.length() - 1) {
            if (S.charAt(i) == ch) {
                matchCount++;
                i++;
                if (matchCount == count) {
                    return S.substring(i);
                }
            } else {
                i++;
            }
        }
        return "Empty string";
    }
}
