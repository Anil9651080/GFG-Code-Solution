import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Remove_duplicates_in_small_prime_array {
    ArrayList<Integer> removeDuplicate(int arr[], int n) {
        LinkedHashSet<Integer> lset = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            lset.add(arr[i]);
        }
        ArrayList<Integer> Alist = new ArrayList<>(lset);
        return Alist;
    }
}
