package Evidence;

public class TwoDimentionalArray {

    public static void main(String[] args) {
        int[][] twoD = {
            {9, 8, 7, 2},
            {4, 6, 2,}
        };
        int sum = 0;
        for (int[] oneD : twoD) {
            for (int i : oneD) {
                System.out.println(i + " ");
                sum += i;
            }
            System.out.println();
        }
        System.out.println("Sum of the Array is: " + sum);
    }

}
