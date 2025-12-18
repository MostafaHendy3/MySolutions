1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3     int[] res ={0,0};
4        outerloop:
5        for(int i=0;i<nums.length;i++){
6            res[0]=i;
7            for(int j=i+1;j<nums.length;j++){
8                if(target == nums[i]+nums[j]){
9                    res[1]=j; 
10                    break outerloop;
11                }
12            }
13            
14        }
15        return res;    
16    }
17}