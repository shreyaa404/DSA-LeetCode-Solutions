 
/*
 * LeetCode 219 - Contains Duplicate II
 *
 * Problem:
 * Given an integer array nums and an integer k, return true if there are
 * two distinct indices i and j such that:
 *
 *      nums[i] == nums[j]
 *      abs(i - j) <= k
 *
 * Otherwise, return false.
 *
 *
 * ---------------------------------------------------------
 * Understanding the Problem:
 * ---------------------------------------------------------
 *
 * We need to find a duplicate number in the array.
 *
 * But there is one additional condition:
 * The two duplicate numbers must be at most k positions apart.
 *
 * Example:
 *
 * nums = [1, 2, 3, 1]
 * k = 3
 *
 * Index:  0  1  2  3
 * Value:  1  2  3  1
 *
 * The number 1 appears at index 0 and index 3.
 *
 * nums[0] == nums[3]  -> true
 *
 * Distance between the indices:
 *
 * abs(0 - 3) = 3
 *
 * Since 3 <= k (3), the answer is true.
 *
 *
 * ---------------------------------------------------------
 * Approach:
 * ---------------------------------------------------------
 *
 * I used two nested loops.
 *
 * The outer loop selects the first index i.
 *
 * The inner loop starts from i + 1 so that:
 *
 * 1. We don't compare an element with itself.
 * 2. The two indices are always distinct.
 *
 * We then check two conditions:
 *
 * 1. nums[i] == nums[j]
 *    -> Checks whether the values are duplicates.
 *
 * 2. Math.abs(i - j) <= k
 *    -> Checks whether the duplicate values are within k indices.
 *
 * If both conditions are true, we immediately return true.
 *
 * If all possible pairs are checked and no valid pair is found,
 * we return false.
 *
 *
 * ---------------------------------------------------------
 * Important Points:
 * ---------------------------------------------------------
 *
 * 1. "Distinct indices" means i and j cannot be the same.
 *
 * 2. Math.abs(i - j) gives the distance between two indices.
 *
 * 3. The value must be the same AND the index distance must
 *    be less than or equal to k.
 *
 * 4. The inner loop starts from i + 1 instead of 0 because
 *    we only need to compare the current element with the
 *    elements that come after it.
 *
 *
 * ---------------------------------------------------------
 * Complexity:
 * ---------------------------------------------------------
 *
 * Time Complexity: O(n²)
 * Because in the worst case, we compare many pairs of elements.
 *
 * Space Complexity: O(1)
 * Because we are not using any extra data structure.
 *
 *
 * ---------------------------------------------------------
 * Key Learning:
 * ---------------------------------------------------------
 *
 * This problem is an extension of LeetCode 217 - Contains Duplicate.
 *
 * LeetCode 217 asks:
 * "Does any value appear more than once?"
 *
 * LeetCode 219 asks:
 * "Does any value appear more than once AND are the duplicate
 * indices within k positions of each other?"
 *
 */


class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for(int i = 0; i < nums.length; i++){

            for(int j = i + 1; j < nums.length; j++){

                if (nums[i] == nums[j] && Math.abs(i - j) <= k){

                    return true;

                }
            }
        }

        return false;
    }
}
```
