public class Equal_Left_and_Right_Subarray_Sum {
    int equalSum(int[] A, int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        int pre = 0;
        for (int i = 0; i < N; i++) {
            sum -= A[i];
            if (pre == sum) {
                return i + 1;
            }
            pre += A[i];
        }
        return -1;
    }
}
