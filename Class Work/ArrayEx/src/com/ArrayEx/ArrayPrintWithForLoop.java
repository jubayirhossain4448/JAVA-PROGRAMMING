package com.ArrayEx;

import java.util.Arrays;

public class ArrayPrintWithForLoop {

    public static void main(String[] args) {
        int sum = 0;
        int[] myList = new int[5];
        myList[0] = 54;
        myList[1] = 55;
        myList[2] = 56;
        myList[3] = 57;
        myList[4] = 58;

        for (int i = 0; i < myList.length; i++) {
            System.out.println("Result: " + myList[i]);
            sum += myList[i];

        }
        System.out.println("The total of Array is: " + sum);
    }

}
