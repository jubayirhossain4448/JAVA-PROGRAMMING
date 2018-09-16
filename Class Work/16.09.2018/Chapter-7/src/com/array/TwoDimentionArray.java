
package com.array;

public class TwoDimentionArray {
    public static void main(String[] args) {
        int twoD [][] = {
            {100, 200, 300, 400, 500},
            {111, 222, 333, 444, 555},
            {999, 888, 777, 666,}
        };
        System.out.println("twoD[2][2] : " + twoD[2][2]);
        for (int oneD[] : twoD){
            for (int i : oneD){
                System.out.println(i +" ");
            }
            System.out.println();
        
        }
    }
    
}
