import java.util.HashMap;

class Twice_Counter {
    public int countWords(String list[], int n) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(list[i])) {
                map.put(list[i], map.get(list[i]) + 1);
            } else {
                map.put(list[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (map.get(list[i]) == 2) {
                count++;
            }
        }
        return count / 2;
    }
}