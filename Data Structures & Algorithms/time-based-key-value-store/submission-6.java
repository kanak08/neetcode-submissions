class TimeMap {
    public Map<String,TreeMap<Integer,String>> hm;

    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key)){
            hm.put(key, new TreeMap<Integer,String>(Map.of(timestamp, value)));
        }else{
            hm.get(key).put(timestamp, value);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!hm.containsKey(key)){ return "";}
        TreeMap<Integer,String> sub_hm= hm.get(key);
        Map.Entry<Integer,String> tm = sub_hm.floorEntry(timestamp);
        return tm == null? "" : tm.getValue();              
    }
}
