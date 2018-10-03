
package EvidenceFinal;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        isLargest(sc.nextInt(), sc.nextInt(), sc.nextInt());
        
    }
    static void isLargest(int n1, int n2, int n3){
    if(n1>n2 && n1>n3){
        System.out.println(n1 + " is the largest number");
    }else if(n2>n1 && n2>n3){
        System.out.println(n2 + " is the largest number");
    }else if(n3>n1 && n3>n2){
        System.out.println(n3 + " is the largest number");
    }else {
        System.out.println(n1 + " " + n2 + " " +n3 + "all are equals");
    }
    }
    
}
