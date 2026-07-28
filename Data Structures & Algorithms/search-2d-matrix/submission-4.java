class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int h = rows*cols-1;
        while(l <= h){
            int m = l+(h-l)/2;
            int ele = matrix[m/cols][m%cols];
            if(ele == target){
                return true;
            }
            else if(ele < target){
                l = m+1;
            }
            else if(ele > target){
                h = m-1;
            }
        }

        return false;
    }
}
