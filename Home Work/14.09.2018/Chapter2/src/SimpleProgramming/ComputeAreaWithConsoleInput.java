
package SimpleProgramming;
import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a radius (value)
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        // Compute area
        double area = radius * radius * 3.14159;
        
        // Display results 
        
        System.out.println("The area of the circle of radius " + radius + " is " + area);
        
    }
    
}
