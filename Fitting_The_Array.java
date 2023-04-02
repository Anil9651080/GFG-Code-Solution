import java.util.Arrays;

public class Fitting_The_Array {
    public static boolean isFit(int arr[], int brr[], int n) {
        Arrays.sort(arr);
        Arrays.sort(brr);
        for (int i = 0; i < n; ++i) {
            if (arr[i] > brr[i]) {
                return false;
            }
        }
        return true;
    }
}
