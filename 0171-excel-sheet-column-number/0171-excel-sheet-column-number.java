class Solution {
    public int titleToNumber(String columnTitle) {
        int num = 0;
        char[] col = columnTitle.toCharArray();
        for(int i = 0;i< col.length;i++){
            num+=Math.pow(26,col.length-i-1)*((int)col[i]-64);
        }
        return num;
    }
}