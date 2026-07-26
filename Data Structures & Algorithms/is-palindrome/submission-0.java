class Solution {
    public boolean isPalindrome(String s) {
        int b=0;
        
        String sl=s.toLowerCase().replaceAll(" ","").replaceAll("[^a-zA-z0-9]","");
        int e=sl.length()-1;

        while(b<e){

            if(sl.charAt(b)!=sl.charAt(e)){
                return false;
            }
            b++; e--;
        }
        return true;
    }
}
