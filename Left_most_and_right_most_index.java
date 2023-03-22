
class Left_most_and_right_most_index {

    public pair indexes(long v[], long x) {
        long first = findOcc(v, x, true);
        long last = findOcc(v, x, false);
        pair p1 = new pair(first, last);
        return p1;
    }

    static long findOcc(long[] v, long x, boolean flag) {
        long low = 0;
        long high = v.length - 1;
        long result = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (x == v[(int) mid]) {
                result = mid;
                if (flag) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (x < v[(int) mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}