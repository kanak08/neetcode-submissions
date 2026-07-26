class Solution {
    public int trap(int[] height) {
        if(height.length<3){return 0;}
        // int l_max=height[i];
        // int r_max=height[j];
        int result=0;
        int[] l_max= new int[height.length];
        int[] r_max= new int[height.length];
        l_max[0]= height[0];
        r_max[height.length-1]= height[height.length-1];

        for(int i=1;i<height.length;i++){
            l_max[i]= Math.max(l_max[i-1],height[i]);
        }

        for(int i=height.length-2;i>=0;i--){
            r_max[i]= Math.max(r_max[i+1],height[i]);
        }
        // int i=0;
        // int j=height.length-1;

        // while(height[i]<height[i+1] && i<(height.length)){
        //         i++;
        // }
        // while(height[j]<height[j-1] && j>=0){
        //         j--;
        // }
        // int m=1;
        // int n=height.length-1;


        for(int i=0;i<height.length;i++){
            result+= Math.min(l_max[i],r_max[i])-height[i];

        }
        return result;   
    }
}
