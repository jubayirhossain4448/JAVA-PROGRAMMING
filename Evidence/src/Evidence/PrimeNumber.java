
package Evidence;
import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        isPrimeNumber(sc.nextInt());
    }
    
    static void isPrimeNumber(int num){
    if(BigInteger.valueOf(num).isProbablePrime(1)){
        System.out.println(num +  " is Prime number");
    }else{
        System.out.println(num + " is not prime number");
    }
    }
 
}
