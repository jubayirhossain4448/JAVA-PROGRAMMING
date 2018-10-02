
package Evidence;

public class ArrayS {
    public static void main(String[] args) {
        int [] arr = {1, 5, 8, 9};
        int sum = 0;
        for(int i : arr){
        sum +=i;
            System.out.println(i + " ");
        }
        System.out.println("Sum: " +sum);
    }
    
}
