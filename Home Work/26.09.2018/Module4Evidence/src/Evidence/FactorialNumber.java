
package Evidence;


public class FactorialNumber {
    public static void main(String[] args) {
        int febCon = 1;
        int b = 1;
        for (int i = 0; i <10; i++){
        int c = febCon+b;
            System.out.print(" " + c);
            febCon = b;
            b = c;
        }
    }
    
}
