
package Evidence;
import java.util.Scanner;
import java.math.BigInteger;

public class PrimeNumberTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number here plz");
        isPrimeNumber(sc.nextInt());
    }
    static void isPrimeNumber(int num){
    if(BigInteger.valueOf(num).isProbablePrime(1)){
        System.out.println(num + " is prime number");
    }else{
        System.out.println(num + " is not prime number");
    }
    }
}
