import java.util.HashSet;

class Pangram_Checking {
    // Function to check if a string is Pangram or not.
    public static boolean checkPangram(String str) {
        // your code here
        str = str.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                set.add(str.charAt(i));
        }
        return (set.size() == 26) ? true : false;
    }
}