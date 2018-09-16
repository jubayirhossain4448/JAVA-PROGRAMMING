import java.util.Scanner;

public class TernaryOperatorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        System.err.println((num % 2 == 0) ? "Num is Even" : "Num is Odd");
    }
    
}
