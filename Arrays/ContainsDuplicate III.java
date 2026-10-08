class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

       

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // Check whether the indices are close enough
                // and the values are close enough.
                if (Math.abs(i - j) <= indexDiff &&
                    Math.abs(nums[i] - nums[j]) <= valueDiff) {

                    // A valid pair has been found.
                    return true;
                }
            }
        }

        // No valid pair was found.
        return false;
    }
}

 /*
         * Problem:
         * Find whether there exist two different indices i and j such that:
         *
         * 1. |i - j| <= indexDiff
         * 2. |nums[i] - nums[j]| <= valueDiff
         *
         * In simple words:
         * We need to find two elements that are close to each other
         * in position and whose values are also close to each other.
         *
         * Approach:
         * Use a brute-force approach with two nested loops.
         *
         * - The outer loop selects index i.
         * - The inner loop checks every index j after i.
         * - For each pair, we check both required conditions.
         * - If both conditions are satisfied, return true.
         * - If no valid pair is found, return false.
         *
         * Since j starts from i + 1, i and j are always different.
         * Therefore, checking i != j is not necessary.
         *
         * Time Complexity: O(n^2)
         * In the worst case, we compare almost every pair of elements.
         *
         * Space Complexity: O(1)
         * No extra data structure is used.
         */
