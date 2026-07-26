class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int l=0;
        int result=0;
        int maxf=0;
        if(s.length()==0){return 0;}
        for(int r=0; r<s.length(); r++){
            char c= s.charAt(r);
            hm.put(c,hm.getOrDefault(c,0)+1);
            maxf= Math.max(maxf,hm.get(c));

            
            while(((r-l+1)-maxf)>k){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                l++;
            }
            result = Math.max(result, r-l+1);
        }
        return result;
    }
}
