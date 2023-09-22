import java.util.ArrayList;
import java.util.Collections;

public class Merge_k_Sorted_Arrays {
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                ar.add(arr[i][j]);
            }
        }
        Collections.sort(ar);
        return ar;

    }
}
