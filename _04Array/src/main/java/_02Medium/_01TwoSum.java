package _02Medium;

import java.util.HashMap;
import java.util.Map;

public class _01TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int check = target - nums[i];

            if (map.containsKey(check)) {
                return new int[]{map.get(check), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
    System.out.println("hello");

    }
}
