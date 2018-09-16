
import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Input: ");

        int Jubayir = sc.nextInt();
        switch (Jubayir) {
            case 0:
                System.out.println("123");
                break;
            case 1:
                System.out.println("222");
                break;
            case 2:
                System.out.println("333");
                break;
            case 3:
                System.out.println("444");
                break;
            default:
                System.out.println("..................Md.Jubayir Hossain................");
                //System.exit(1);

        }
    }

}
