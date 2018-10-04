
package com.Evidence;


public class ArrayDisplayAndSum {
    public static void main(String[] args) {
        int [] arr = {4, 5, 9, 8 ,1};
        int sum = 0;
        for(int i : arr){
        sum += i;
            System.out.println(i + " ");
        }
        System.out.println("Sum: " + sum);
    }
    
}
