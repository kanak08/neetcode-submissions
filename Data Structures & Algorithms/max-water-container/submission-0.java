class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int result=0;
        int sub=0;
        while(i<j){
            sub = Math.min(heights[i],heights[j])*(j-i);
            if(sub>result){
                result=sub;
            }
            if(heights[i]<=heights[j]){
                    i++;
            }
            else if(heights[i]>heights[j]){
                    j--;
            }
            
        }
        return result;
    }
}
