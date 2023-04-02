import java.util.PriorityQueue;

public class Adding_Array_Elements {
    int minOperations(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        int count = 0;
        while (pq.peek() < k && pq.size() > 1) {
            count++;
            int f = pq.poll();
            int s = pq.poll();
            pq.add(f + s);
        }
        if (pq.peek() < k) {
            return -1;
        }
        return count;
    }
}
