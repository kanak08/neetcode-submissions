class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int b=i+1;
            int e=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){continue;}
            while(b<e){
                int sum= nums[b]+nums[e]+nums[i];
                if(sum==0){
                    List<Integer> sublist= new ArrayList<>(Arrays.asList(nums[i],nums[b],nums[e]));
                    if(!result.contains(sublist)){
                        result.add(sublist);
                    }
                    e--; b++;
                }
                else if(sum>0){
                    e--;
                }
                else if(sum<0){
                    b++;
                }
            }
            
        }
        return result;
    }
}
