import java.util.Map;
import java.util.HashMap;

class Second_most_repeated_string_in_a_sequence {
    String secFrequent(String arr[], int N) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String str : arr) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        int highestCount = Integer.MIN_VALUE;
        int secondHighestCount = Integer.MIN_VALUE;
        String secondMostRepeatedString = null;
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            if (count > highestCount) {
                secondHighestCount = highestCount;
                highestCount = count;
                secondMostRepeatedString = entry.getKey();
            } else if (count > secondHighestCount && count < highestCount) {
                secondHighestCount = count;
                secondMostRepeatedString = entry.getKey();
            }
        }
        return secondMostRepeatedString;
    }
}