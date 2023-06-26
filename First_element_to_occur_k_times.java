import java.util.HashMap;

public class First_element_to_occur_k_times {
    public int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
            if (map.get(a[i]) == k) {
                return a[i];
            }
        }
        return -1;

    }
}
