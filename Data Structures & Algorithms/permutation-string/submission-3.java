class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // HashMap<Character, Integer> hm= new HashMap<>();
        int[] s1_c= new int[26];
        int[] s2_c= new int[26];
        for(char c: s1.toCharArray()){
            // hm.put(c,hm.getOrDefault(c,0)+1);
            s1_c[c-'a']++;
        }
        char[] ca = s2.toCharArray();
        int l=0;
        int r=0;
        int s1_len =s1.length();
        while(r < s2.length()){
            if(r-l+1 <= s1_len){
                s2_c[ca[r]-'a']++;
                r++;
            }
            else{
                if(Arrays.equals(s1_c,s2_c)){
                    return true;
                }
                else{
                    s2_c[ca[l]-'a']--;
                    l++;
                    // r++;
                }
            }
        }
        if(Arrays.equals(s1_c,s2_c)){
                    return true;
        }
    return false;
    }
}
