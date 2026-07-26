class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int b=0;
        int e=numbers.length-1;
        while(b<e){
            if(numbers[b]+numbers[e]==target){
                return new int[]{b+1,e+1};
            }
            else if(numbers[b]+numbers[e]>target){
                e--;
            }
            else if(numbers[b]+numbers[e]<target){
                b++;
            }
        }
        return new int[0];
    }
}
