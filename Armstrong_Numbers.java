public class Armstrong_Numbers {
    static String armstrongNumber(int n) {
        int sum = 0;
        sum = (int) (Math.pow(n % 10, 3) + Math.pow((n / 10) % 10, 3) + Math.pow((n / 100), 3));
        if (sum == n) {
            return "Yes";
        } else {Print first n Fibonacci Numbers

            return "No";
        }
    }
}
