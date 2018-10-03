
package EvidenceFinal;
import java.util.*;
public class MaxMinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers ");
        
        int n = sc.nextInt();
        Integer [] arr = new Integer[n];
        
        for (int i = 0; i<arr.length; i++){
        arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println( "Min: " + arr[0] + "Max: " + arr[arr.length-1]);
    }
}
