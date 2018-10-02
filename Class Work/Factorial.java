
package xam;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        getFactorial(7);
    }
    static void getFactorial(int n){
        BigInteger f = BigInteger.valueOf(1);
        for (int i =1; i <= n ; i++){
        f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }
    /*
    static void getFactorial(int n){
    int f = 1;
    for(int i =1; i <= n ; i++){
    f*= i;
    }
    System.out.println(f);
    }
    
    */
    
}
