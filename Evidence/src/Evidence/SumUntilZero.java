
package Evidence;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        System.out.println("Please enter a number: ");
        
        do{
        n = sc.nextInt();
        sum += n;
        }while(n !=0);
        sum += n;
        System.out.println("Sum: " + sum);
    }
    
}
