class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result=0;
        if(s.length()==0){return result;}
        if(s.length()==1){return 1;}
        StringBuilder sub= new StringBuilder();
        StringBuilder str= new StringBuilder(s);
        for(int i=0; i<str.length(); i++){
            String sc= str.substring(i,i+1);
            
            if(sub.toString().contains(sc)){
                int index=sub.indexOf(sc);
                sub.delete(0,index+1);
            }
            // else{
            sub.append(sc);
            result = Math.max(result, sub.length());
            // }
            
        }
        return result;
    }
}
