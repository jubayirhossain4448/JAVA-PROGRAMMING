package com.array;

public class TwoDimentionalArray {

    public static void main(String[] args) {
        //int x[] = {2, 3, 5};// Single dimentional
        //int y[] = {7, 8, 9};

        int twoD[][] = {
            {25, 33, 55, 99},
            {73, 18, 96, 0},
            {111, 222, 333, 44}
        };
        System.out.println("twoD[2][1]: " + twoD[2][1]);
        System.out.println();
        System.out.println("twoD[0][2]: " + twoD[0][2]);
        System.out.println();
        for(int oneD[] : twoD){
            for (int i : oneD){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }

}
