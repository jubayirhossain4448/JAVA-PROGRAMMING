
package EvidenceThree;
import java.util.Scanner;

public class OddEvenN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        isOddEven(sc.nextInt());
        
    }
    static void isOddEven(int num){
    if(num ==0){
        System.out.println(num + " is Zero");
    }else{
    if(num % 2 == 0){
        System.out.println(num + " is Even");
    }else{
        System.out.println(num + " is Odd number");
    }
    }
    }
    
}
