import java.util.Arrays;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       char[] s = ransomNote.toCharArray();
        char[] m =magazine.toCharArray();
        int[] res =new int[s.length];
        int flag = 0;
        for (int i=0;i<s.length;i++) {
            for(int j=0;j<m.length;j++){
                if(m[j] ==s[i]){
                    res[i] =1;
                    m[j]='9';
                    break;
                }
                
            }
        }
        flag = Arrays.stream(res).min().getAsInt();

        return flag==1;
    }
}