
package EvidenceThree;
import java.math.BigInteger;
import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Number");
        isPrimeNumber(sc.nextInt());
        
    }
    static void isPrimeNumber(int num){
    if(BigInteger.valueOf(num).isProbablePrime(1)){
        System.out.println(num + " is Prime Number");
    }else{
        System.out.println(num + " is Not Prime Number");
    }
    }
    
}
