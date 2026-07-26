class Solution {
    public int trap(int[] height) {
        if(height.length==0){return 0;}
        int i=0;
        int j=height.length-1;
        int l_max= height[0];
        int r_max= height[height.length-1];
        int result=0;
        while(i<j){
            if(l_max<r_max){
                i++;
                l_max= Math.max(height[i],l_max);
                result+=l_max-height[i];
            }
            else{
                j--;
                r_max= Math.max(height[j],r_max);
                result+=r_max-height[j];
            }

        }
        return result;   
    }
}
