
package Evidence;

public class ArraySum {
    public static void main(String[] args) {
        int [] arr = {1, 5, 8, 9, 1, 3};
        int sum = 0;
        for(int i : arr){
        sum += i;
            System.out.println(i + " ");
        }
        System.out.println("Sum of the Array is: " + sum);
    }
    
}
