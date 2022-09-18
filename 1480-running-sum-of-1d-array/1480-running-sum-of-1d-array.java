class Solution {
    public int[] runningSum(int[] nums) {
        int len =nums.length;
        int[] prefixsum = new int[len];
        prefixsum[0] = nums[0];
        for (int i = 1; i < len; i++) {
            prefixsum[i] = prefixsum[i - 1] + nums[i];
        }
        return prefixsum;
    }
}