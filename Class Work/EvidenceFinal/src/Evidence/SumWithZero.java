package Evidence;

import java.util.Scanner;

public class SumWithZero {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please Enter a number");

        do {
            n = sc.nextInt();
            sum += n;
        } while (n != 0);
        sum += 0;
        System.out.println("Sum: " + sum);

    }

}
