public class Rearrange_a_string {
    public String arrangeString(String s) {

        ArrayList<Character> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                list.add(s.charAt(i));
            } else {
                count += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        StringBuilder result = new StringBuilder();
        Collections.sort(list);
        for (char c : list) {
            result.append(c);
        }
        if (count != 0) {
            result.append(count);
        }
        return result.toString();
    }
}
