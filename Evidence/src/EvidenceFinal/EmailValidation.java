
package EvidenceFinal;
import java.util.*;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email");
        
        String email= sc.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        
        if(atpos>0 && dotpos<email.length()-1 && atpos<dotpos-1 ){
            System.out.println("You have entered valid mail");
        }
        else{
            System.out.println("Your mail is not correct");
        }
        
    }
    
}
