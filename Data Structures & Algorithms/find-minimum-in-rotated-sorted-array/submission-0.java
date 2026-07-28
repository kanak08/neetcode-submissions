class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        if(nums[nums.length-1]>nums[0]){return nums[0];}
        // if(nums.length==2){return Math.min(nums[0],nums[1]);}

        int l=0, r=nums.length-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(nums[l]<=nums[m]){
                min = Math.min(min,nums[l]);
                l = m+1;
            }else{
                min = Math.min(min, nums[m]);
                r = m-1;
            }

        }

        return min;
    }
}
