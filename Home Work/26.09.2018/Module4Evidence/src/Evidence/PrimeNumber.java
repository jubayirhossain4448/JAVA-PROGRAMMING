
package Evidence;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int m = 0;
        for (int i = 1; i <= number; i++){
        if(number%i==0){
        m = m + 1;
        }
        }
        if(m==2){
            System.out.println(number + " is prime number");
        }else{
            System.out.println( number + " is not prime number");
        }
    }
    
}
