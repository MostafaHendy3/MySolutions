class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("\\p{Punct}","");
        s=s.replaceAll("\\p{Space}","");
        int i = 0;
        int j = s.length()-1;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        
        return true ;
    }
}