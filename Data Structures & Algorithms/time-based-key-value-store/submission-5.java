class TimeMap {
    public HashMap<String,HashMap<Integer,String>> hm;

    public TimeMap() {
        hm = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key)){
            hm.put(key, new HashMap<Integer,String>(Map.of(timestamp, value)));
        }else{
            hm.get(key).put(timestamp, value);
        }        
    }
    
    public String get(String key, int timestamp) {
        int ts= -1;
        HashMap<Integer,String> sub_hm= hm.get(key);
        if(hm.containsKey(key)){
            
            if(sub_hm.containsKey(timestamp)){
                return sub_hm.get(timestamp);
            }
            
            Set<Integer> al = sub_hm.keySet();
            for(int a: al){
                if(a<=timestamp){
                    ts = Math.max(ts, a);
                }
            }
        }
        return (ts==-1)?"":sub_hm.get(ts);
    }
}
