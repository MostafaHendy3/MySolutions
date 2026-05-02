class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        int l = 0 ;
        int r = letters.size()-1;
        int mid = l + (r-l)/2;
        char result = 0;
        while(l<=r){
            mid = (l+r)/2;
            if(letters[mid] <= target){      
                l = mid+1;
            }else if(letters[mid] > target) {
                r = mid-1;
            }
        }
        return letters[l % letters.size()];
    }
};