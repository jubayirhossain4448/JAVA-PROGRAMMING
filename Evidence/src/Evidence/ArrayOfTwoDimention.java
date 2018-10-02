
package Evidence;

public class ArrayOfTwoDimention {
    public static void main(String[] args) {
        int [][] twoD = {
            {6, 9, 7, 3},
            {6, 1, 7}
        };
        int sum = 0;
        for(int[] oneD : twoD){
        for(int i : oneD){
            System.out.println(i + "");
            sum += i;
        }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }
    
}
