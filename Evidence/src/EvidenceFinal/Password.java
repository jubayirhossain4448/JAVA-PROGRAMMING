
package EvidenceFinal;

import java.util.*;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        
        String password = sc.nextLine();
        if(password.length()>7){
            System.out.println("valid");
        }else{
            System.out.println("is not valid");
        }
    }
}
