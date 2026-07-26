class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c =='[' || c == '{' || c == '('){
                st.push(c);
            }
            else if(!st.empty() && c == ')' && st.peek() == '('){
                st.pop();
            }
            else if(!st.empty() && c == '}' && st.peek() == '{'){
                st.pop();
            }
            else if(!st.empty() && c == ']' && st.peek() == '['){
                st.pop();
            }
            else{
                return false;
            }
        }
        if(st.empty())
            return true;

        return false;
    }
}
