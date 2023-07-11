public class Minimum_distance_between_two_numbers {
    int minDist(int a[], int n, int x, int y) {
        int dist = Integer.MAX_VALUE;
        int st = -1;
        int ed = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                st = i;
            }
            if (a[i] == y) {
                ed = i;
            }
            if (st != -1 && ed != -1) {
                dist = Math.min(Math.abs(ed - st), dist);
            }
        }
        if (dist != Integer.MAX_VALUE) {
            return dist;
        }
        return -1;
    }
}
