class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Map<Character,Character> map = new HashMap<>();
        
        map.put(sChars[0],tChars[0]);
        for (int i = 1; i < sChars.length; i++) {
            if(map.containsKey(sChars[i])){
                if(map.get(sChars[i])!= tChars[i]){
                    return false;
                }
            }else{
                 if(map.containsValue(tChars[i])){
                    return false;
                }
                map.put(sChars[i],tChars[i]);
            }
        }
        return true;
    }
}