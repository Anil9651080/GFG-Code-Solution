public class Roof_Top {
    static int maxStep(int A[], int N) {
        int csum = 0;
        int msum = 0;
        for (int i = 1; i < N; i++) {
            if (A[i] > A[i - 1]) {
                csum += 1;
                msum = Math.max(csum, msum);
            } else {
                csum = 0;
            }
        }
        return msum;

    }
}
