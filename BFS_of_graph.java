import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_of_graph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        boolean visited[] = new boolean[V];
        visited[0] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            ans.add(curr);
            for (int neighb : adj.get(curr)) {
                if (!visited[neighb]) {
                    q.add(neighb);
                    visited[neighb] = true;
                }
            }
        }
        return ans;
    }
}
