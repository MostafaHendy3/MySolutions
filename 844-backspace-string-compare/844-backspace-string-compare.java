class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character> ss = new Stack<>();
        Stack<Character> tt = new Stack<>();
        for (char chars :
                s.toCharArray()) {
            if (chars == '#') {
                if (!ss.isEmpty()) {
                    ss.pop();
                }
            } else {
                ss.push(chars);
            }
        }
        for (char chart :
                t.toCharArray()) {
            if (chart == '#') {
                if (!tt.isEmpty()) {
                    tt.pop();
                }
            } else {
                tt.push(chart);
            }
        }
        return Objects.equals(ss.toString(), tt.toString());
    }
}