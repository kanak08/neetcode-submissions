class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> st = new Stack<>();
        int[][] pair = new int[position.length][2];
        for(int i=0; i<pair.length; i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }

        Arrays.sort(pair, Comparator.comparingInt(a->a[0]));
        for(int i = position.length-1; i>=0; i--){
            double t = (double)(target-pair[i][0])/pair[i][1];
            if(!st.empty()){
                if(st.peek()<t){
                    st.push(t);
                }
            }else{
                st.push(t);
            }
        }

        return st.size();
    }
}
