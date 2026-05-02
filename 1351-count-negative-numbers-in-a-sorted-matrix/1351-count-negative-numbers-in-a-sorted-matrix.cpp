class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
       int count_neg = 0 ;
        int m = grid.size();
        int n = grid[0].size();
        for(int i = 0 ; i<m;i++){
            int l = 0; 
            int r = n-1;
            int mid = l + (r-l)/2;
            while(l<=r){
                mid = (l+r)/2;
                if(grid[i][mid] < 0){      
                     r = mid-1;
                }else if(grid[i][mid] >= 0) {
                    l = mid+1;
                }
            }
            count_neg += n-l;
        }
        return count_neg;
    }
};