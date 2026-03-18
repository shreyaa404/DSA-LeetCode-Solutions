// LeetCode Problem: Two Sum
// Approach: Brute Force
// Time Complexity: O(n^2)

class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] result=new int[2];
        for(int i=0 ; i<nums.length-1 ; i++){
            for(int j=1 ; j<nums.length ; j++){
                int sum=nums[i]+nums[j];
                if (target== sum){
                     result[0]=i;
                     result[1]=j;
                }
            }
        }
        return result;
    }
}
