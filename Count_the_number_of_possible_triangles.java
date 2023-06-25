import java.util.Arrays;

public class Count_the_number_of_possible_triangles {
    static int findNumberOfTriangles(int arr[], int n) {
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] <= arr[k])
                        break;
                    ans++;
                }
            }
        }
        return ans;
    }
}
