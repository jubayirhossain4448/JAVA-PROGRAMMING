import java.util.Scanner;

public class PassFailSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks =sc.nextInt();
        int status =0;
        if (marks <70){
        status = 1;
       
        }else{
        status = 0;
        }
        
        switch (status){
            case 0:
                System.out.println("Failed");
                break;
        }
    }
    
}
