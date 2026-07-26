class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int l=0; 
        int r=0;
        int maxf=0;
        int result=0;
        while(r<s.length()){
            char c = s.charAt(r);
            hm.put(c, hm.getOrDefault(c,0)+1);
            maxf = Math.max(maxf,hm.get(c));
            if((r-l+1)-maxf > k){
                hm.put(s.charAt(l), hm.get(s.charAt(l))-1);
                l++;
            }
                
            result = Math.max(result, r-l+1);
            r++;
            
        }
        return result;
    }
}
