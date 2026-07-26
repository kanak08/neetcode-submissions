class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                int s = st.pop();
                int f = st.pop();
                st.push(s+f);
            } else if(tokens[i].equals("*")){
                int s = st.pop();
                int f = st.pop();
                st.push(s*f);
            } else if(tokens[i].equals("-")){
                int s = st.pop();
                int f = st.pop();
                st.push(f-s);
            } else if(tokens[i].equals("/")){
                int s = st.pop();
                int f = st.pop();
                if(f==0){st.push(0);}
                else{st.push(f/s);}
            } else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}
