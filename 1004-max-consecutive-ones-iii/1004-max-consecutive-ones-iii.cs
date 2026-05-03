public class Solution {
    public int LongestOnes(int[] nums, int k) {
        int l = 0;
        int numOfZ = 0;
        int max_zeroz=0;
        int window_length = 0;
        int max_length=0;
        for(int r = 0 ; r<nums.Length;r++){
            window_length++;
            
            if(nums[r]==0){
                numOfZ++;
            }
            while(numOfZ>k){
                if(nums[l]==0){
                    numOfZ--;
                }
                window_length--;
                l++;
            }
            max_length = Math.Max(max_length, window_length);
        }
        return max_length;
    }
}