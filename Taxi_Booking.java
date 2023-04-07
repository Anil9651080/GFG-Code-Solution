public class Taxi_Booking {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; ++i) {
            int currTime = Math.abs(cur - pos[i]) * time[i];
            ans = Math.min(ans, currTime);
        }
        return ans;
    }
}
