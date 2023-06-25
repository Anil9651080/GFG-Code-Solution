import java.util.ArrayList;

public class Sum_of_Middle_Elements_of_two_sorted_arrays {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr1.add(ar1[i]);
            arr2.add(ar2[i]);
        }
        arr1.addAll(arr2);
        arr1.sort(null);
        int mid = (arr1.size() - 1) / 2;
        int mid1 = arr1.size() / 2;

        return arr1.get(mid) + arr1.get(mid1);
    }
}
