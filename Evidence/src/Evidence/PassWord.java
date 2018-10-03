
package Evidence;
import java.util.*;

public class PassWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Password");
        
        
        String password = s.nextLine();
        if(password.length()>=7){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
    }
            
}
