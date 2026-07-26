class Solution {
    public boolean isPalindrome(String s) {
        int b=0;
        int e=s.length()-1;

        while(b<e){
            if(!Character.isLetterOrDigit(s.charAt(b))){b++; continue;}
            if(!Character.isLetterOrDigit(s.charAt(e))){e--; continue;}

            if(Character.toLowerCase(s.charAt(b))!=Character.toLowerCase(s.charAt(e))){
                return false;
            }
            b++; e--;
        }
        return true;
    }
}
