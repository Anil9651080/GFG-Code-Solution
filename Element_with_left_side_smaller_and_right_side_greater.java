public class Element_with_left_side_smaller_and_right_side_greater {
    public int findElement(int arr[], int n) {
        int mx[] = new int[n];
        int mn[] = new int[n];
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
            mx[i] = max;
        }
        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(arr[i], min);
            mn[i] = min;
        }
        for (int i = 1; i < n - 1; i++) {
            if (mx[i] == mn[i]) {
                return mx[i];
            }
        }
        return -1;
    }
}
