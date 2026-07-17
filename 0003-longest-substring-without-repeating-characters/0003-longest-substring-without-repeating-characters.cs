public class Solution {
    public int LengthOfLongestSubstring(string s) {
        HashSet<char> set =new();
        int max = 0;
       int left = 0;
        for (int i = 0; i < s.Length; i++) {
            while (set.Contains(s[i])) {
                max = Math.Max(max, set.Count);
                set.Remove(s[left]);
                left++;
            } 
            set.Add(s[i]);
            max = Math.Max(max, i - left +1);
        }
        return max;
    }
}