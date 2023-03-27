public class Nearest_multiple_of_10 {

    // function to round the number
    static int round(int n) {
        // Smaller multiple
        int a = (n / 10) * 10;

        // Larger multiple
        int b = a + 10;

        // Return of closest of two
        return (n - a > b - n) ? b : a;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        int n = 4722;
        System.out.println(round(n));
    }
}
