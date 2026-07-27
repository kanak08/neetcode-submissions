class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        int l=0, r=0;
        Stack<Integer> st = new Stack<>();
        while(r < temperatures.length){
            while(l>=0){
                if(!st.empty() && temperatures[r] > st.peek() && result[l] == 0){
                    result[l] = r-l;
                    st.pop();
                }
                l--;
            }
            st.push(temperatures[r]);
            l = r;
            r++;
        }


        return result;
    }
}
