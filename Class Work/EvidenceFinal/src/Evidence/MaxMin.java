
package Evidence;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int n = sc.nextInt();
        Integer [] arr = new Integer [n];
        
        for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
       
        
    }
    
}
