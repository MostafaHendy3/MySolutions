using System.Text.RegularExpressions;
public class Solution {
    public bool IsPalindrome(string s) {
        string filtered = Regex.Replace(s, "[^a-zA-Z0-9]", "").ToLower();
        Console.WriteLine(filtered);
        int i = 0;
        int j = filtered.Length-1;
        while(i<=j){
            if(filtered[i]==filtered[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }
        
        return true ;
    }
}