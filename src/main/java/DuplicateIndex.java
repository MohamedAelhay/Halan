import java.util.HashSet;
import java.util.Set;

public class DuplicateIndex {
    public int indexOfFirstIndex(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(numSet.contains(nums[i])){
                return i;
            } else {
                numSet.add(nums[i]);
            }
        }

        return -1;
    }
}
