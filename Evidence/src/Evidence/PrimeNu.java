package Evidence;

import java.util.Scanner;
import java.math.BigInteger;

public class PrimeNu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        isPrimeNu(sc.nextInt());
    }

    static void isPrimeNu(int num) {
        if (BigInteger.valueOf(num).isProbablePrime(1)) {
            System.out.println(num + " is Prime Number ");
        } else {
            System.out.println(num + " is not Prime Number " );
        }
    }

}
