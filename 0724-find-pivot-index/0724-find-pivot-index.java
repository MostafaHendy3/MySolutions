class Solution {
    public int pivotIndex(int[] nums) {
        int len =nums.length;
        
        
        int[] prefixsum = new int[len];
        prefixsum[0] = nums[0];
        for (int i = 1; i < len; i++) {
            prefixsum[i] = prefixsum[i - 1] + nums[i];
        }
        
        int[] postsum = new int[len];
        postsum[len-1] =nums[len-1];
        for(int i =len-2;i>=0;i--){
            postsum[i] =postsum[i + 1] + nums[i];
        }
        
        
        for(int i = 0 ; i <nums.length;i++){
            if(postsum[i]==prefixsum[i]){
                return i;
            }
        }
        return -1;
    }
}