public class Make_Array_Elements_Equal {
    public long minOperations(int N) {
        // Code here
        int mid = N / 2;
        return N % 2 == 0 ? (long) mid * (long) mid : (long) mid * (long) (mid + 1);
    }
}
