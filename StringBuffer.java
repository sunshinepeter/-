package cn.com.jdzj.www


public final class StringBuffer{
  /*数组，用于存储字符串*/
  char[] value;
  /* 用于标记字符串的长度*/
  int count;
  /* 默认剩余空间 */
  private final static int  MIN_BUFFER = 16；
  
  /**
   *构造函数：这里提供3种 
   */
   public StringBuffer(){
     value = new char[MIN_BUFFER];
   }
   
   public StringBuffer(int capacity){
     value = new char[capacity];
   }
   
   public StringBuffer(String str){
     value = new char[str.length() + MIN_BUFFER];
     append(str);
   }
   
   /**
    * 获取字符串长度
    */
    public synchronized int length(){
      return count;
    }
    
  /**
   * 获取总容量
   */
   public synchronized int capacity(){
     return value.length；
   }
   
  /**
   * 保证总容量
   */
   public synchronized void ensureCapacity(int minimumCapacity){
     if(minimumCapacity >= value.length){
       expendCapacity(minimumCapacity);
     }
   }
   
   /**
    * 扩展总容量
    */
   
   
}
