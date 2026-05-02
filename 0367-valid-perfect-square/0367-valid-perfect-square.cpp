class Solution {
public:
    bool isPerfectSquare(int num) {
        long long l = 0;
        long long r = num;
        long long mid=l + (r-l)/2;
        while(l<=r){
            mid=l + (r-l)/2;
            if(num < mid * mid){
                r=mid-1;
            }else if(num > mid * mid){
                l=mid+1;
            }else{
                return true;
            }
        }
        return false;
        
    }
};