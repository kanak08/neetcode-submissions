class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[][] count= new int[nums.length][2];
        if(nums.length==1){return new int[] {nums[0]};}
        Arrays.sort(nums);
        int l=0;
        int r=1;
        int i=0;
        while(r<nums.length){
            if(nums[r]==nums[l]){
                r++;
            }
            else{
                count[i][0]=nums[l];
                count[i][1]=r-l;
                i++;
                l=r;
                r++;
            }
        }
        count[i][0]=nums[l];
        count[i][1]=r-l;
        
        Arrays.sort(count,Comparator.comparingInt(a->a[1]));
        int[] result=new int[k];
        int len=count.length-1;
        for(int m=0;m<k;m++){
            result[m]=count[len][0];
            len--;
        }
        return result;
    }
}
