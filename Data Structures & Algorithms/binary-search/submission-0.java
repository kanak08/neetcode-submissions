class Solution {
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1;
        return binarySearch(nums, l, r, target);
    }

    public int binarySearch(int[] nums, int l, int r, int target){
        if(l>r){ return -1;}
        int mid = l+((r-l)/2);
        if(nums[mid]==target){
                return mid;
        }
        return (nums[mid]>target)?binarySearch(nums, l, mid-1, target):binarySearch(nums, mid+1, r, target);
    }
}
