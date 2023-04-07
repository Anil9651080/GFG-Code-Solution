public class Add_Minimum_Characters {
    public static int addMinChar(String str) {
        int n = str.length();
        int i = 0, j = n - 1, temp = n - 1;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
            } else {
                j = temp;
                i = 0;
                temp--;
            }
            j--;
        }
        return n - temp - 1;
    }
}
