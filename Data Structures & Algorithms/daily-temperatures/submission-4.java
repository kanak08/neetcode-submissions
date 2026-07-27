class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        int index = 0;

        int r=0;
        Stack<int[]> st = new Stack<>();
        while(r < temperatures.length){
            
            while(!st.empty() && temperatures[r] > st.peek()[0]){
                int[] top_element = st.peek();
                
                if(result[top_element[1]]==0){
                    st.pop();
                    result[top_element[1]] = r-top_element[1];
                }
            }
            
            st.push(new int[] {temperatures[r],r});
            r++;
        }


        return result;
    }
}
