public class Solution {
    public string MergeAlternately(string word1, string word2) {
        int ptr1 = 0;
        int ptr2 = 0;
        int i= 0;
        string result = "";
        while(i < word1.Length + word2.Length){
            if(ptr1<word1.Length)
                {
                    result+=word1[ptr1];
                    ptr1++;
                }
            if(ptr2<word2.Length)
                {
                    result+=word2[ptr2];
                    ptr2++;
                }
            
            i++;
        }
        return result;
    }
}