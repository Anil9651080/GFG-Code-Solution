public class Frequencies_of_Limited_Range_Array_Elements {
    public static void frequencyCount(int arr[], int N, int P) {
        int set[] = new int[N];

        for (int i = 0; i < N; i++) {
            if (arr[i] > N) {
                continue;
            }
            set[arr[i] - 1]++;
        }
        for (int a = 0; a < N; a++) {
            arr[a] = set[a];
        }

    }
}
