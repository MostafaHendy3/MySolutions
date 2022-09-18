class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ls = new ArrayList<Integer>();
        for(int i =0;i<nums.length;i+=2){
            for(int j =0;j<nums[i];j++){
                ls.add(nums[i+1]);
            }
        }
        return ls.stream().mapToInt(i-> i).toArray();
    }
}