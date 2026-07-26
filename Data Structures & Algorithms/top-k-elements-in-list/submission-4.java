class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        ArrayList<int[]> arr= new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            arr.add(new int[]{entry.getValue(),entry.getKey()});
        }
        arr.sort((a,b)->(b[0]-a[0]));
        int[] result= new int[k];
        for(int i=0;i<k;i++){
            result[i]=arr.get(i)[1];       
        }
        return result;
    }
}
