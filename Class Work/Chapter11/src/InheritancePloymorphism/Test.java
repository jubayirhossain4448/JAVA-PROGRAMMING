
package InheritancePloymorphism;

public class Test {
    
    public static void main(String[] args) {
        
        B b1 = new B(); // b is object and it's reference is B class
        A b2 = new B();// b2 is object and it's reference is A class
        A a1 = new A();// a1 is object and it's reference is A class
        
        ///// But...................///////////////////
        //B a2 = new A (); // wrong, child can not be reference of parent
        
    }
}
