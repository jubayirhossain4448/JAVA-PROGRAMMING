
package ExceptionExamples;
import java.util.Scanner;
public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two integers
        System.out.println("Enter two integer numbers");
        
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        
        System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
    }
    
}
