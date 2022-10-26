class Solution {
    public int lengthOfLastWord(String s) {
       int len = 0;
        s=s.trim();
        int i =s.length()-1;
        if(!s.contains("\s")){
            return s.length();
        }
        while(s.charAt(i)!=' '){
            len++;
            i--;
        }
        return len;
    }
}