
package Lesson07.Generics;


public class CacheString {
  
    private String message;
  
    public void add(String message){
        this.message = message;
    }
  
    public String get(){
        return this.message;
    }  
  
}
