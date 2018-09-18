
package Evidence;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a Starting number and ending number: ");
        int startNumber = input.nextInt();
        int endingNumber = input.nextInt();
        int sum =0;
        
       
        for(startNumber=0; startNumber<endingNumber; startNumber++){
            
            sum += startNumber;
            
            System.out.println("The sum of the two number is: " + sum);
        
        }
         
    }
    
}
