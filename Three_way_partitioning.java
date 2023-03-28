import java.util.Arrays;

class Three_way_partitioning {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b) {
        int start = 0, end = array.length - 1;
        int n = array.length;
        Arrays.sort(array);
        for (int i = 0; i < n; i++) {
            if (array[i] < a) {
                start++;
            } else if (array[i] >= a && array[i] <= b) {
                break;
            } else {
                end--;
            }
        }
    }
}