class Solution {
    public int  getSum(int n ){
        int sum =0;
        while(n>0){
            int r = n%10;
            n /=10;
            sum+=r*r;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = getSum(n);
        }
        return n == 1;
    }
}
