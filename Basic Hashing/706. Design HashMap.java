class MyHashMap {
HashMap<Integer,Integer> map1;
    public MyHashMap() {
      map1=new HashMap<>();  
    }
    
    public void put(int key, int value) {
        map1.put(key,value);
    }
    
    public int get(int key) {
        if(!map1.containsKey(key)) return -1;
     return map1.get(key);  
    }
    
    public void remove(int key) {
     map1.remove(key);   
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */