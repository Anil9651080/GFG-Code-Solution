public class Row_with_max_1s {
    int rowWithMax1s(int arr[][], int n, int m) {
        // int row = 0;
        int ans = -1;
        int col = m - 1;
        for (int i = 0; i < n; i++) {
            while (col >= 0 && arr[i][col] == 1) {
                col--;
                ans = i;
            }
        }
        return ans;
    }
}
