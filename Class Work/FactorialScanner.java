
package xam;


import java.io.InputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class FactorialScanner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number :");
        int number = sc.nextInt();
        getFactorial(number);
    }
    
    static void getFactorial(int n){
        BigInteger f = BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
        f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }

}
