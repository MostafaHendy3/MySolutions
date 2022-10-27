class Solution {
    public int countOdds(int low, int high) {
       if(low%2==0){
            low++;
        }
        if(high%2==0){
            high--;
        }
        if(high==low)return 1;
        return (high-low)/2+1; 
    }
}