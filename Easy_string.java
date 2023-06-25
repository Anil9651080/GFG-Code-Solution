public class Easy_string {
    String transform(String S) {
        String temp = S.toLowerCase();
        int count = 0;
        char tmp = temp.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) != tmp) {
                sb.append(count).append(tmp);
                count = 0;
                tmp = temp.charAt(i);
            }
            count++;
        }
        sb.append((count)).append(temp.charAt(temp.length() - 1));
        return sb.toString();
    }
}
