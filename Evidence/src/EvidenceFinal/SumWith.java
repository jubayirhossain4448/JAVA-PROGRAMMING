
package EvidenceFinal;

import java.util.*;
public class SumWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        
        int n = 0;
        int sum = 0;
        do{
        n = sc.nextInt();
        sum += n;
        }while(n !=0);
        sum +=n;
        System.out.println("Sum: " + sum);
    }
}
