class Solution {
public:
    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k) {
        int m=grid.size();
        int n=grid[0].size();
       vector<vector<int>> res(m,vector<int>(n));
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                int index =(i*n+j+k)%(m*n);
                int x= index/n;
                int y= index%n;
                res[x][y]=grid[i][j];
            }
        }
        return res;
    }
};