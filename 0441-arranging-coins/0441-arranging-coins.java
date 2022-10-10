class Solution {
    public int arrangeCoins(int n) {
        int count =0;
        for(int i=0;i<n;i++ ){
            n-=i;
            if(n>=0 && n>i){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}