
package EvidenceThree;
import java.util.*;

public class ArrayFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your values");
    int arraySize = sc.nextInt();
    Integer []arr = new Integer[arraySize];
    
    for(int i=0; i<arr.length; i++){
    arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
 
}
