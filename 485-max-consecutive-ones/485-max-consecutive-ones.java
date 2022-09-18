class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int ones=0;
        int temp=0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]==1){
                ones++;
                if(ones>temp){
                    temp=ones;
                }
            }else{
                ones=0;
            }
        }
        return temp;
    }
}