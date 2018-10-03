
package EvidenceThree;


public class TwoDimentionalArray {
    public static void main(String[] args) {
        int [] [] twoD = {
            {8, 9, 7, 6, 5, 3},
            {3, 6, 4, 5, 1, 8}
        };
        int sum = 0;
        for(int [] oneD: twoD){
        for(int i : oneD){
            System.out.print(i + "  ");
            sum += i;
        }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }
    
}
