public class Form_a_number_divisible_by_3_using_array_digits {
    static int isPossible(int N, int arr[]) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        if (sum % 3 == 0) {
            return 1;
        }
        return 0;
    }
}
