import java.util.ArrayList;
import java.util.Collections;

public class Sum_of_two_numbers_represented_as_arrays {
    ArrayList<Integer> findSum(int a[], int b[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = a.length, m = b.length;
        int i = n - 1, j = m - 1, sum = 0, carry = 0;
        while (i >= 0 || j >= 0) {
            int A = 0, B = 0;
            if (i >= 0)
                A = a[i--];
            if (j >= 0)
                B = b[j--];
            sum = A + B + carry;
            list.add(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            list.add(carry);
        }
        Collections.reverse(list);
        return list;

    }

}
