class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        HashSet<Integer> set= new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        for(int num: nums){
            int length=0;
            if(!set.contains(num-1)){
                length=1;
                num=num+1;
                while(set.contains(num)){
                    length++;
                    num++;
                }
                longest =Math.max(longest,length);
            }
            
        }
        return longest;
    }
}
