import java.util.ArrayList;
import java.util.HashMap;

public class Count_distinct_elements_in_every_window {
    ArrayList<Integer> countDistinct(int A[], int n, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
        }
        ans.add(hm.size());
        for (int i = k; i < n; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
            hm.put(A[i - k], hm.get(A[i - k]) - 1);
            if (hm.get(A[i - k]) == 0) {
                hm.remove(A[i - k]);
            }
            ans.add(hm.size());

        }
        return ans;
    }
}
