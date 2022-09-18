class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            } else {
                mp.put(nums[i], 1);
            }
        }
        int max = 0;
        int temp =0;
        for (int i = 0; i < nums.length; i++) {
            if(mp.get(nums[i])>max){
                max=mp.get(nums[i]);
                temp =nums[i];
            }
        }
        return temp;
    }
}