class Minimum_Number_in_a_sorted_rotated_array {
    // Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}