public class K_th_element_of_two_sorted_Arrays {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        int i = 0, j = 0, ans = arr1[0];
        while (i < n && j < m && k > 0) {
            if (arr1[i] <= arr2[j]) {
                ans = arr1[i++];
            } else {
                ans = arr2[j++];
            }
            k--;
        }
        while (i < n && k > 0) {
            ans = arr1[i++];
            k--;
        }
        while (j < m && k > 0) {
            ans = arr2[j++];
            k--;
        }
        return ans;
    }
}
