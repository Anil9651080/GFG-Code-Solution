import java.util.PriorityQueue;

public class Minimize_the_Sum {
    long minimumSum(int n, int arr[]) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            p.add(arr[i]);
        }
        long sum = 0;
        while (p.size() > 1) {
            int a = p.remove();
            int b = p.remove();
            p.add(a + b);
            sum += (long) a + b;
        }
        return sum;
    }
}
