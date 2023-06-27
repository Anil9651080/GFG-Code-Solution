public class Shortest_Distance_to_Target_String_in_a_Circular_Array {
    public int closetTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int dist = Math.abs(startIndex - i);
                ans = Math.min(ans, Math.min(dist, n - dist));
            }

        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
