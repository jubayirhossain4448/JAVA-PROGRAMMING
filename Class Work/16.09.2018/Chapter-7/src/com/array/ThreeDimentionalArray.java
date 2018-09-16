package com.array;

public class ThreeDimentionalArray {

    public static void main(String[] args) {
        int threeD[][][] = {
            {
                {100, 200, 300, 400, 500},
                {111, 222, 333, 444, 555},
                {999, 888, 777, 666,}
            },
            {
                {100, 200, 300, 400, 500},
                {111, 222, 333, 444, 555},
                {999, 888, 777, 666,}
            },
            {
                {100, 200, 300, 400, 500},
                {111, 222, 333, 444, 555},
                {999, 888, 777, 666,}
            }

        };
        for (int twoD[][] : threeD){
        for (int oneD [] : twoD){
        for (int i : oneD){
            System.out.print(i + " ");
        };
            System.out.println();
        };
            System.out.println();
        };
    }

}
