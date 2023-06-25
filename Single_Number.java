public class Single_Number {
    int getSingle(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = count ^ arr[i];
        }
        return count;
    }
}
