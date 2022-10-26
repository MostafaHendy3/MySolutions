class Solution {
     public String reverseVowels(String s) {
        if(s.length()==1)return s;
        char[] chars =s.toCharArray();
        int reader = 0;
        int writer =chars.length-1;
        char temp=' ';
        while(reader<writer){
            while(reader<s.length() && !vowel(chars[reader])){
                reader++;
            }
            while(writer>=0 && !vowel(chars[writer])){
                writer--;
            }
            if(reader<writer){
                temp=chars[reader];
                chars[reader]=chars[writer];
                chars[writer]=temp;
                reader ++;
                writer --;
            }
        }
        return new String(chars);
    }
    public static boolean vowel(char t){
        return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U';
    }
}