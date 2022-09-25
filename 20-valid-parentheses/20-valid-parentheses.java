class Solution {
    public boolean isValid(String s) {
        char[] ch =s.toCharArray();
        Stack<Character> st =new Stack<Character>();
        int flag =0;
        for (char c : ch) {
            if (c == '(') {
                st.push(c);
                flag=1;
            }
            if (c == ')') {
               if(!st.empty()){ 
                if (st.peek() == '(') {
                    st.pop();
                }else{
                    return false;
                }
               }else {
                   return false;
               }
            }
            
            if (c == '{') {
                st.push(c);
                flag=1;
            }
            if (c == '}') {
               if(!st.empty()){ 
                if (st.peek() == '{') {
                    st.pop();
                }else{
                    return false;
                }
               }else {
                   return false;
               }
            }
            
            
            
            if (c == '[') {
                st.push(c);
                flag=1;
            }
            if (c == ']') {
               if(!st.empty()){ 
                if (st.peek() == '[') {
                    st.pop();
                }else{
                    return false;
                }
               }else {
                   return false;
               }
            }
            
        }
        return st.empty() && flag==1;
        
    }
}