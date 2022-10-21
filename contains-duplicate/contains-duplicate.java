class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int s:nums) {
            if(!set.add(s)){
                return true;
            }
        }
        return false;
    }
}