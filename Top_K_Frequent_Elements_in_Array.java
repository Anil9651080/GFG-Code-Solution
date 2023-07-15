import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Top_K_Frequent_Elements_in_Array {
    public int[] topK(int[] nums, int k) {
        Map<Integer, Integer> v = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (v.containsKey(i)) {
                v.put(i, v.get(i) + 1);
            } else {
                v.put(i, 1);
            }
        }
        ArrayList<Integer> m = new ArrayList<Integer>(v.keySet());
        Collections.sort(m, (a, b) -> {

            int freqCompare = v.get(b) - v.get(a);

            if (freqCompare == 0) {
                return b - a;
            }
            return freqCompare;
        });
        int a[] = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = m.get(i);
        }
        return a;
    }
}
