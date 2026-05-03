public class Solution {
    public int MajorityElement(int[] nums) {
        Dictionary<int,int> map = new Dictionary<int,int>();
        for(int i = 0 ; i< nums.Length ; i++){
            if(map.ContainsKey(nums[i])){
                map[nums[i]]++;   
            }else{
                map.Add(nums[i],1);
            }
            if (map[nums[i]] >nums.Length/2){
                return nums[i];
            }
        }
        return nums[0];
    }
}