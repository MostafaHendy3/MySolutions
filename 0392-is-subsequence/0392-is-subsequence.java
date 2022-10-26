class Solution {
    public boolean isSubsequence(String s, String t) {
       int writer=s.length()-1;
        int reader = t.length()-1;
        String temp ="";
        if(s.isEmpty()){
            return true;
        }else if(t.isEmpty()){
            return false;
        }
        while(writer>=0 && !s.isEmpty()){
            if(s.charAt(writer)==t.charAt(reader)){
                temp=t.charAt(reader) +temp;
                writer--;
            }
            if(reader==0){
                break;
            }else {
                reader--;
            }
        }
        return s.equals(temp);
    }
}