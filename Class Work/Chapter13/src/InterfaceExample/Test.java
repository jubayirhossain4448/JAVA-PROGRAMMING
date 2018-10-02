
package InterfaceExample;


public class Test {
    public static void main(String[] args) {
      Object[] objs = {new Dog(), new Cat()};
      for(int i = 0; i <objs.length; i++){
     if(objs[i] instanceof Animal){
          System.out.println(((Animal)objs[i]).eat());
      
      }
      }
    }
    
}
