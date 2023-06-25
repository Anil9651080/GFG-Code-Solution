import java.util.ArrayList;

public class Arranging_the_array {
    public void Rearrange(int a[], int n) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                arr1.add(a[i]);
            } else {
                arr2.add(a[i]);
            }
        }
        arr1.addAll(arr2);
        for (int i = 0; i < n; i++) {
            a[i] = arr1.get(i);
        }
    }
}
