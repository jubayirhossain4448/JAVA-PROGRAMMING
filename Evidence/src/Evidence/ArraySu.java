package Evidence;

public class ArraySu {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 2, 6, 5};
        int sum = 0;
        for (int i : arr) {
            sum += i;
            System.out.println(i + " ");
        }
        System.out.println("Sum: " + sum);
    }
}
