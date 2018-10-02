
package Evidence;

public class ArrayAndSum {
    public static void main(String[] args) {
        int [] arr = {9, 8, 3, 6, 4, 8, 66, 1};
        int sum = 0;
        for (int i : arr){
        sum += i;
            System.out.println(i + "");
        }
        System.out.println("Sum: " + sum);
    }
    
}
