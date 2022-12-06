public class ST<Key implements Comparable<Key>, Value> {
    
    public ST() {}
    
    public Value get(Key key) {}
    
    public void put(Key key, Value val) {}
    
    public void delete(Key key) {}
    
    public boolean contains(Key key) {}
    
    public int size() {}
    
    public boolean isEmpty() {}
    
    public Key min() {}
    
    public Key max() {}
    
    public Key ceiling(Key key) {}
    
    public Key floor(Key key) {}
}