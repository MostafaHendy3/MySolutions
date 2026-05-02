public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        HashSet<int> set = new HashSet<int>();
        int [] result = new int[2];
        for (int i = 0; i < nums.Length; i++)
        {
            set.Add(nums[i]);
            if (set.Contains(target - nums[i]))
            {
               if (i == Array.IndexOf(nums, target - nums[i]))
                {
                    continue;
                }
                result[0] = i;
                result[1] = Array.IndexOf(nums, target - nums[i]);
            }
        }
        return result;
    }
}