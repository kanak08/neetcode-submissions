class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int flag=0;
        boolean all_zero=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            {product = product*nums[i]; all_zero=false;}
            else if(nums[i]==0){flag++;}

        }
        if(all_zero){return nums;}

        for(int i=0;i<nums.length;i++){
            if(flag!=0){
                if(nums[i]!=0){nums[i]=0;}
                else if(flag>1){nums[i]=0;}
                else if(nums[i]==0){nums[i]=product;}
                
            }
            else{
                nums[i]=product/nums[i];
            }
        }
        return nums;
    }
}  
