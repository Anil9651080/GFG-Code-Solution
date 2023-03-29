class Ease_the_Arrays {
    void modifyAndRearrangeArr(int arr[], int n) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
            }
        }
        int k = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] != 0) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k++;
            }
        }
    }
}