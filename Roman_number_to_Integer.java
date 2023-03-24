
class Roman_number_to_Integer {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        int ans = 0;
        int num = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (num * 4 < ans)
                ans -= num;
            else
                ans += num;
        }
        return ans;
    }
}