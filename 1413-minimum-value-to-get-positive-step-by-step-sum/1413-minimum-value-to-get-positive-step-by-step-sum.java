class Solution {
    public int minStartValue(int[] nums) {
        int[] prefixsum =new int[nums.length];
        prefixsum[0]=nums[0];
        int min=prefixsum[0];
        for (int i =1;i<nums.length;i++){
            prefixsum[i]=prefixsum[i-1]+nums[i];
            if(min>prefixsum[i]){
                min=prefixsum[i];
            }
        }
        if(min>0)return 1;
        return Math.abs(min-1); 
    }
}