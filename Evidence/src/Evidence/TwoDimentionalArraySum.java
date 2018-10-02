
package Evidence;


public class TwoDimentionalArraySum {
    public static void main(String[] args) {
        int [][] twoD = {
            {4, 8, 9, 2},
            {3, 5, 6,}
        };
        int sum = 0;
        for(int [] oneD : twoD){
        for(int i : oneD){
            System.out.println(i + " ");
        sum += i;
            
        }
            System.out.println();
        }
        System.out.println("sum: " + sum);
    }
    
}
