import java.util.HashMap;
import java.util.Map;

public class Number_of_occurrence {
    int count(int[] arr, int n, int x) {
        Map<Integer, Integer> m = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getKey() == x) {
                return entry.getValue();
            }
        }

        return 0;
    }
}
