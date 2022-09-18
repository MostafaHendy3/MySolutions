class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       int m =grid.length;
        int n =grid[0].length;
        Integer[][] ans =new Integer[m][n];
        k%=m*n;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                int index = (i * n + j + k) % (m * n);
                int x = index / n;
                int y = index % n;
                ans[x][y] = grid[i][j];
            }
        }
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<m;i++){
            result.add(Arrays.asList(ans[i]));
        }
        return result; 
    }
}