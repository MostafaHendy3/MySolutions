class Solution {
    public int largestAltitude(int[] gain) {
      int highest =0;
        int len =gain.length;
        int[] prefixsum = new int[len];
        prefixsum[0] = gain[0];
        if(prefixsum[0]>highest){
            highest = prefixsum[0];
        }
        for (int i = 1; i < len; i++) {
            prefixsum[i] = prefixsum[i - 1] + gain[i];
            if(prefixsum[i]>highest){
                highest = prefixsum[i];
            }
        }
        return highest ;  
    }
}