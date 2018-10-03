
package Evidence;
import java.util.*;

public class EmailV {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your e-mail please");
        
        String email= s.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        
        if(atpos >0 && dotpos<email.length()-1 && atpos<dotpos-1){
            System.out.println("Email is valid");
        }else{
            System.out.println("Email is invalid");
        }
    }
    
}
