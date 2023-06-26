public class Convert_array_into_Zig_Zag_fashion {
    public void zigZag(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            } else {
                if (a[i + 1] > a[i]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}
