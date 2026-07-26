class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result=0;
        int l=0;
        if(s.length()==0){return result;}
        if(s.length()==1){return 1;}
        HashSet<Character> sub= new HashSet<>();
        for(int r=0; r<s.length(); r++){
            char c= s.charAt(r);
            while(sub.contains(c)){
                sub.remove(s.charAt(l));
                l++;
            }
            sub.add(c);
            result = Math.max(result, r-l+1);
            
        }
        return result;
    }
}
