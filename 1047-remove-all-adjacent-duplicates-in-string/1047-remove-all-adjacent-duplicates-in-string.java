class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack =new Stack<>();
        for(int i = 0 ;i <s.length();i++){
            if(stack.isEmpty() || s.charAt(i) != stack.peek()){
                stack.add(s.charAt(i));
            }else{
                stack.pop();
            }
        }
        String result="";
        while(!stack.isEmpty()){
            result = stack.peek() + result;
            stack.pop();
        }
        return result;
    }
}