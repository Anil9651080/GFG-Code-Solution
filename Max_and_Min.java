public class Max_and_Min {
    static class Pair {
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        int i;
        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for (i = 2; i < n; i++) {
            if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            }

        }
        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = { 1000, 11, 455, 12, 330, 330 };
        int size = arr.length;
        Pair minmax = getMinMax(arr, size);
        System.out.println(minmax.min);
        System.out.println(minmax.max);
    }

}
