class MyHashSet {

    HashSet<Integer> hs = new HashSet<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) 
    {
        hs.add(key);
    }
    
    public void remove(int key) {
        hs.remove(key);
    }
    
    public boolean contains(int key) {
        if(hs.contains(key))
            return true;
        else
            return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
