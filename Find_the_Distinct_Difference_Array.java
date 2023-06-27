import java.util.HashSet;

public class Find_the_Distinct_Difference_Array {
    public int[] distinctDifferenceArray(int[] nums) {
        int diff[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> prefixset = new HashSet<>();
            HashSet<Integer> suffixset = new HashSet<>();
            for (int j = 0; j < nums.length; j++) {
                if (j <= i) {
                    prefixset.add(nums[j]);
                }
                if (j > i) {
                    suffixset.add(nums[j]);
                }
            }
            diff[i] = prefixset.size() - suffixset.size();
        }
        return diff;
    }
}
