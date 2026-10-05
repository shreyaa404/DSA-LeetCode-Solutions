/*
 * LeetCode 217 - Contains Duplicate
 *
 * Problem:
 * Given an integer array nums, return true if any value appears at least twice.
 * Return false if every element is unique.
 *
 * Example:
 * nums = [1, 2, 3, 1] -> true
 * nums = [1, 2, 3, 4] -> false
 *
 * Approach used here:
 * Compare every element with the elements that come after it.
 * If two values are equal, a duplicate exists.
 *
 * Important:
 * - Start the inner loop from i + 1 so we do not compare an element with itself.
 * - Compare VALUES: nums[i] == nums[j]
 * - Do not use i == j because i and j are indexes, not array values.
 * - In LeetCode, nums is already provided as a method parameter.
 *   Do NOT create a new nums array inside the method.
 *
 * Complexity:
 * Time  : O(n^2)  -> nested loops
 * Space : O(1)    -> no extra data structure is used
 *
 * Pattern to remember:
 * Nested loop + compare each pair = brute-force pair comparison.
 *
 * Possible optimization:
 * A HashSet can solve this problem in O(n) average time, but this file
 * intentionally keeps the brute-force solution because it is useful for
 * understanding the basic array/pair-comparison approach.
 */

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
