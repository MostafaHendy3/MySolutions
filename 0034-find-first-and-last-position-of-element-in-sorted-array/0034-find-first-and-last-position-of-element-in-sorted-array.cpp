class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int l = 0;
        int r = nums.size()-1;
        int mid = l + (r-l)/2;
        int ans =-1;
        while(l<=r){
            mid = l + (r-l)/2;
            if(nums[mid] < target){
                l = mid+1;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                r=mid;
                l=mid;
                while((r+1<nums.size() && nums[r+1] == target) || (l-1>=0 && nums[l-1] == target)){
                        if(r+1<nums.size() && nums[r+1]==target){
                            r++;
                        }
                        if(l-1>=0 && nums[l-1]==target){
                            l--;
                        }
                    }
                return {l,r};           
            }
        }
        return {-1,-1};
    }
};