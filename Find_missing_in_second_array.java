import java.util.*;
//doone
public class Find_missing_in_second_array {
    ArrayList<Long> findMissing(long A[], long B[], int N, int M) {
        HashSet<Long> set = new HashSet<>();
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            set.add(B[i]);
        }
        for (int i = 0; i < N; i++) {
            if (!set.contains(A[i])) {
                list.add(A[i]);
            }
        }
        return list;
    }
}
