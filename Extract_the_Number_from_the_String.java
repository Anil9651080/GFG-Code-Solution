public class Extract_the_Number_from_the_String {
    long ExtractNumber(String S) {
        String[] str = S.split(" ");
        long max = -1;

        for (String elem : str) {
            if (elem.charAt(0) >= '0' && elem.charAt(0) <= '8') {
                if (!elem.contains("9")) {
                    if (Long.parseLong(elem) > max) {
                        max = Long.parseLong(elem);
                    }
                }
            }
        }
        return max;
    }
}
