class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum=0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("D")){
                st.push(st.peek()*2);
                sum+=st.peek();
            }
            else if(operations[i].equals("C")){
                
                sum-=st.pop();
            }
            else if(operations[i].equals("+")){
                int e1 = st.pop();
                int s = e1+st.peek();
                st.push(e1);
                st.push(s);
                sum+=st.peek();
            } else{
                st.push(Integer.parseInt(operations[i]));
                sum+=st.peek();
            }

        }

        return sum;
    }
}