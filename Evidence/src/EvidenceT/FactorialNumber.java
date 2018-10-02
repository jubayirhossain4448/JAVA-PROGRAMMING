
package EvidenceT;
import java.util.Scanner;
import java.math.BigInteger;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        getFactorial(sc.nextInt());
        
    }
    static void getFactorial(int n){
    BigInteger f = BigInteger.valueOf(1);
    for (int i = 1; i<n; i++){
      f = f.multiply(BigInteger.valueOf(i));
    }
        System.out.println(f);
  
    }
    
}
