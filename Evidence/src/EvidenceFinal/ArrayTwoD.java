
package EvidenceFinal;


public class ArrayTwoD {
    public static void main(String[] args) {
        int [][] arr = {
            {9, 8, 7, 6},
            {1, 2, 5, 6}
        };
        int sum = 0;
        for(int [] oneD : arr){
        for( int i : oneD){
            System.out.println(i + " ");
            sum +=i;
        }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }
    
}
