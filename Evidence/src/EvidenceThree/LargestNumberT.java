
package EvidenceThree;
import java.util.Scanner;

public class LargestNumberT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Number");
        isLargestN(sc.nextInt(), sc.nextInt(), sc.nextInt());
        
    }
    static void isLargestN(int n1, int n2, int n3){
    if(n1>n2 && n1>n3){
        System.out.println(n1 + " is the Largest Number");
    }else if(n2>n1 && n2>n3){
    System.out.println(n2 + " is the Largest Number");
    }else if(n3>n1 && n3>n2){
    System.out.println(n3 + " is the Largest Number");
    }else{
        System.out.println(n1 + " ," + n2 + " ," + n3 + " all are equals numbers");
    }
    }
    
}
