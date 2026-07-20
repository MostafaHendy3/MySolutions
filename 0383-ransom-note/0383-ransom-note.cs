public class Solution {
    public bool CanConstruct(string ransomNote, string magazine) {
        int[] freq  = new int[26];

        
        foreach(var e in magazine){
            freq[e-'a']++;
        }
        foreach(var e in ransomNote){
            freq[e-'a']--;
        }
        foreach(var e in freq){
            if(e<0){
                return false;
            }
        }
        return true;
    }
}