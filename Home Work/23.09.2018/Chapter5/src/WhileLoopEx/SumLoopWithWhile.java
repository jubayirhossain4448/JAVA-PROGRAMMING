package WhileLoopEx;

public class SumLoopWithWhile {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i < 10) {
            sum = sum + i;
            i++;
            System.out.println("Sum is: " + sum);
        }
        System.out.println("Sum is: " + sum);
    }

}
