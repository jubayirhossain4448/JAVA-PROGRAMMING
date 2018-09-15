
package SimpleProgramming.multipleInput;
import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the three numbers
        System.out.println("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        // Compute average
        double average = (number1 + number2 + number3) /3;
        
        // Display the results
        System.out.println("The average of three numbers is: " + average);
        
        
    }
    
}
