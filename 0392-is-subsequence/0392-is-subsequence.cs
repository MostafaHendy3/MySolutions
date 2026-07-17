public class Solution {
    public bool IsSubsequence(string s, string t) {
           int first = 0 ;
           int second = 0;
            if (s.Length > t.Length) return false;
            if (s.Length == t.Length && s == t) return true; 

           while(first<s.Length && second<t.Length){
                // Console.WriteLine(first + " " + second);
               
                if(t[second] == s[first]){
                   first++;
                    second++;
                }else{
                    while(first<s.Length && second<t.Length && t[second] != s[first]) second++;
                }
           }
           
           if(first == s.Length){
                return true;
           }else{
                return false;
           }
    }
}