import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Find_All_Four_Sum_Numbers {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int sum) {
        Arrays.sort(arr);
        HashSet<ArrayList<Integer>> set = new LinkedHashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == sum) {
                            ArrayList<Integer> list = new ArrayList<>();
                            list.add(arr[i]);
                            list.add(arr[j]);
                            list.add(arr[k]);
                            list.add(arr[l]);
                            Collections.sort(list);
                            if (!set.contains(list))
                                set.add(list);
                        }
                    }
                }
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (ArrayList<Integer> ar : set) {
            ans.add(ar);
        }
        return ans;
    }
}
