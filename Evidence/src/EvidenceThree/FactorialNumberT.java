
package EvidenceThree;
import java.util.Scanner;
import java.math.BigInteger;

public class FactorialNumberT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number Please");
        isFactorial(sc.nextInt());
        
    }
    static void isFactorial(int n){
    BigInteger f = BigInteger.valueOf(n);
    for(int i = 1; i<n; i++){
    f = f.multiply(BigInteger.valueOf(i));
    }
        System.out.println(f);
    }
    
}
