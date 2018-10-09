package com.ArrayEx;

public class ArrayWithScanner {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] myList = new int[5];

        for (int i = 0; i < myList.length; i++) {
            System.out.println("enter value for " + i + " index");
            myList[i] = input.nextInt();
        }
        System.out.println("THE array is");
        for (int i = 0; i < myList.length; i++) {
            System.out.println("the value of " + i + " index is " + myList[i]);
            
        }
    }

}
