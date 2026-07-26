class Solution {

    public String encode(List<String> strs) {
        // if(strs.size()==0){return "";}
        StringBuilder enc= new StringBuilder();
        for(String s:strs){
            enc.append(s.length()).append('#').append(s);
        }
        return enc.toString();
    }

    public List<String> decode(String str) {
        // if(str.length()==0){return new ArrayList<String>();}
        int i=0;
        List<String> resp= new ArrayList<>();
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len= Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+len;
            resp.add(str.substring(i,j));
            i=j;
        }
        return resp;
    }
}
