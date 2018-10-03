
package EvidenceThree;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password here please");
        
        String password = sc.nextLine();
        if(password.length()> 7){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
    }
    
}
