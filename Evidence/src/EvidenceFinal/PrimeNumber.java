
package EvidenceFinal;
import java.math.BigInteger;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your nuber");
        isPrime(sc.nextInt());
    }
    
    static void isPrime(int num){
    if(BigInteger.valueOf(num).isProbablePrime(1)){
        System.out.println(num + " is prime number");
    }else{
        System.out.println(num +  " is not prime number");
    }
    }
}
