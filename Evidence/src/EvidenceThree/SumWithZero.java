
package EvidenceThree;
import java.util.*;
public class SumWithZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your values");
        
        int sum =0;
        int n = 0;
        do{
        n = sc.nextInt();
        sum += n;
        }while(n != 0);
        sum += n;
        System.out.println("Sum: " + sum );
    }
    
}
