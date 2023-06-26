import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Uncommon_characters {
    String UncommonChars(String A, String B) {
        HashSet<Character> st1 = new HashSet<>();
        HashSet<Character> st2 = new HashSet<>();

        for (int i = 0; i < A.length(); i++) {
            if (!st1.contains(A.charAt(i))) {
                st1.add(A.charAt(i));
            }
        }
        for (int i = 0; i < B.length(); i++) {
            if (!st2.contains(B.charAt(i))) {
                st2.add(B.charAt(i));
            }
        }
        ArrayList<Character> a1 = new ArrayList<>();
        for (char i : st2) {
            if (!st1.contains(i)) {
                st1.add(i);
            } else
                st1.remove(i);

        }
        for (char i : st1) {
            a1.add(i);
        }
        Collections.sort(a1);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < a1.size(); i++) {
            str.append(a1.get(i));
        }
        if (a1.size() == 0)
            return "-1";
        return str.toString();
    }
}
