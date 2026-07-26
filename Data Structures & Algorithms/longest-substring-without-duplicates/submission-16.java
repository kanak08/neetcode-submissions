class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result=0;
        int l=0;
        if(s.length()==0){return result;}
        if(s.length()==1){return 1;}
        HashMap<Character, Integer> sub= new HashMap<>();
        for(int r=0; r<s.length(); r++){
            char c= s.charAt(r);
            if(sub.containsKey(c)){
                int index= sub.get(c);
                l = Math.max(l, index+1);
                sub.put(c, r);

            }
            else{
                sub.put(c,r);
            }
            result= Math.max(result, r-l+1);
            
        }
        return result;
    }
}
