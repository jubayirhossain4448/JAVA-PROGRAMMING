package EvidenceFinal;

public class ArrayD {

    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 1, 3};
        int sum = 0;
        for (int i : arr) {

            sum += i;
            System.out.println(i + " ");
        }
        System.out.println("Sum: " + sum);
    }

}
