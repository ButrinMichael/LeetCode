package LeetCode.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {

	public static void main(String[] args) {
		int[] nums = { 5, 2, 4 };
		int target = 6;
		LeetCode1 leetCode1 = new LeetCode1();
		int[] a = leetCode1.twoSum(nums, target);

		System.out.println(Arrays.toString(a));

	}

	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> complements = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {					
			Integer complementIndex = complements.get(nums[i]);					
				if (complementIndex != null) {
				return new int[] { i, complementIndex };
			}
			complements.put(target - nums[i], i);
			}
		return nums;
	}

}
