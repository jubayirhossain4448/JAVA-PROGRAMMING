
package EvidenceThree;
import java.util.Scanner;
public class EmailValidationT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your E-mail Here");
        
        String email = sc.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        
        if(atpos > 0 && dotpos<email.length()-1 && atpos<dotpos-1){
            System.out.println("Your email is valid");
        }else{
            System.out.println("your email is invalid");
        }
    }
    
}
