class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[][] A= new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            A[i][0]=nums[i];
            A[i][1]=i;
        }

        Arrays.sort(A, Comparator.comparingInt(a->a[0]));
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum=A[i][0]+A[j][0];
            if(sum==target){
                return new int[]{Math.min(A[i][1],A[j][1]), Math.max(A[i][1],A[j][1])};
            }
            else if(sum<target){
                i++;
            }
            else if(sum>target){
                j--;
            }
        }
        return new int[]{};
    }
}
