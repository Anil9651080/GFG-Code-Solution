import java.util.*;
//done
public class Counting_elements_in_two_arrays {
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr2);
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr1[i] >= arr2[j])
                    count++;
                if (arr1[i] < arr2[j])
                    break;
            }
            list.add(count);
        }
        return list;
    }
}
