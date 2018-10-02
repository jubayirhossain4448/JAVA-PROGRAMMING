package Evidence;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class MaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Min: " + arr[0] + "Max: " + arr[arr.length - 1]);

    }

}
