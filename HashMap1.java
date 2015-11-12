/**
** hashMap ,xiasong create,11/04/2015
** Array + List
**/
public class HashMap{
    private static int DFAULT_CAPACITY = 16;//默认容量
    private int capacity;//当前容量
    private int size;//实际数据
    private Node<k,v>[] bukets;//哈希数组
    
    /*哈希节点：(key | value | next)*/
    static class Node<k,v>{
        private final K key;
        private v value;
        private Node<k,v> next;
        
        //构造函数
        public Node<k key, v value>{
            this.key   = key;
            this.value = value;
        }
        
        public k getKey(){
            return key;
        }
        
        public v getVlaue(){
            return value;	
        }
        
        public void setValue(v value){
            this.value = value;	
        }
        
        public Node<k,v> getNext(){
            retrun next;    	
        }
        
        public void setNext(Node<k,v> next){
        	  retrun this.next = next;
        }
    }
    
    //构造函数
    public hashMap(){
        this hashMap(DFAULT_CAPACITY);
    }
    
    public hashmap(int capacity){
        if(capacity <= 0){
        throw  new IllegalArgumentException("capacity cannot be zero or nagative");	
        }
        
        int temp = 1;
        while(temp < capacity){
            temp <<= 2;	
        }
        this.capacity = temp;
        bukets = new Node<k,v>[this.capacity];
    }
    
    //hash 函数
    private int hashMap(k key){
        
    }
    
    //get
    private Node<k,v> get(k key){
        if(key == null){
    	      throw new IllegalArgumentException("key cannot be null");  
        }
        
        int position = index(key);
        Node<k,v> node = bukets[positon];
        while(node !=bull){
            if(node.getKey().equals(key)){
                return node;	
            }	
            
            node = node.getNext();
        }
        
        return null;
    }
    
    //insert
    public void insert(k key, v value){
        if(key == null){
    	      throw new IllegalArgumentException("key cannot be null");  
        }
        
        Node<k,v> newNode = new Node(key,value);
        int position = index(key);
        
        if(null != bukets[position]){
            newNode.setNext(bukets[position]);
        }
        bukets[position] = newNode;
        size ++;
    }
    
    //put :modify and insert
    private void put(k key,v value){
        if(key == null){
    	      throw new IllegalArgumentException("key cannot be null");  
        }
        
        int position = index(key);
        Node<k,v> node = bukets[positon];
        
        //查找哈希表中是否有该元素
        while(node != null){
            if(node.getKey().equals(key)){
                node.setValue = value;
                return;
            }
            node = node.getNext();
        }
        
        //没有该元素则添加
        Node<k,v> newNode = new Node(key,value);
        if((node=bukets[position]) != null){
            newNode.setNext(node);
        }
        bukets[position] = newNode;
        
        //大小加1
        size++;
    }
    
    //delete
    public void delete(k key){
        if(key == null){
    	      throw new IllegalArgumentException("key cannot be null");  
        }
        
        int position = index(key);
        Node<k,v> node = bukets[posiotion];
        //该元素不存在
        if(node == null){
            return;
        }
        
        //该元素是第一个元素
        if(node.getKey.equals(key)){
            node = node.getNext();
            bukets[position] = node;
            size--;	
            return;
        }
        
        
        //该元素不是第一个
        while(node.getNext() != null){
            if(node.getNext().getKey().equals(key)){
                node.setNext(node.getNext().getNext());
                size--;
                return;
            }	
            node = node.getNext();
        }
        
    }
    
}
