class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        for(int i =0;i<mat[0].length;i++){
            for(int j =0;j<mat[0].length;j++){
                if(i==j){
                    sum+= mat[i][j];
                }else if(mat[0].length==i+j+1){
                    sum+= mat[i][j];
                }
            }
        }
        return sum;
    }
}