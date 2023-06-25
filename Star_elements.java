import java.util.ArrayList;

public class Star_elements {
    public static int[] getStarAndSuperStar(int[] arr, int n) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(arr[n - 1]);
        int maxSoFar = arr[n - 1], secondMax = Integer.MIN_VALUE;
        for (int i = n - 2; i >= 0; --i) {
            if (arr[i] > maxSoFar) {
                secondMax = maxSoFar;
                maxSoFar = arr[i];
                lst.add(arr[i]);
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        int res[] = new int[lst.size() + 1];
        if (maxSoFar > secondMax) {
            res[0] = maxSoFar;
        } else {
            res[0] = -1;
        }
        for (int i = lst.size() - 1; i >= 0; --i) {
            res[lst.size() - i] = lst.get(i);
        }
        return res;

    }
}
