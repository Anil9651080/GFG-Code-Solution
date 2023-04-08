import java.util.Arrays;

public class Check_if_array_contains_contiguous_integers_with_duplicates_allowed {
    public static boolean areElementsContiguous(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = 1; i < n; ++i) {
            if (arr[i] - arr[i - 1] > 1) {
                return false;
            }
        }
        return true;

    }
}
