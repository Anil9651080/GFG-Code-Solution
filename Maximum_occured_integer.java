class Maximum_occured_integer {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int L[], int R[], int n, int maxx) {

        int arr[] = new int[1000001];
        for (int i = 0; i < n; i++) {
            arr[L[i]]++;
            arr[R[i] + 1]--;
        }
        int sum = arr[0];
        int res = 0;
        for (int i = 1; i < maxx; i++) {
            arr[i] += arr[i - 1];
            if (sum < arr[i]) {
                sum = arr[i];
                res = i;
            }
        }
        return res;
    }

}