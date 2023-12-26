package leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer;
        answer = new int[2];
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(target - nums[i])) {
                answer[0] = m.get(target - nums[i]);
                answer[1] = i;
            } else {
                m.put(nums[i], i);
            }
        }
        return answer;

    }
}
