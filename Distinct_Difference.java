import java.util.ArrayList;
import java.util.HashSet;

class Distinct_Difference {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();
        int left[] = new int[N];
        int right[] = new int[N];
        if (N == 0) {
            return ans;
        }
        if (N == 1) {
            ans.add(0);
            return ans;
        }
        if (N == 2) {
            ans.add(1);
            ans.add(1);
            return ans;
        }
        for (int i = 0; i < N; i++) {
            left[i] = set.size();
            set.add(A[i]);
        }
        set = new HashSet<Integer>();
        for (int i = N - 1; i >= 0; i--) {
            right[i] = set.size();
            set.add(A[i]);
        }
        for (int i = 0; i < N; i++) {
            ans.add(left[i] - right[i]);
        }
        return ans;
    }
}