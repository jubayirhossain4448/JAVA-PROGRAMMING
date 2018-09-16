package com.array;

public class ExampleOfThreeDArray {

    public static void main(String[] args) {
        String src[][][] = {
            {{"A", "B", "C", "D"},
            {"a", "b", "c"},
            {"d", "e", "f", "g"},
            {"d", "e", "f", "g"}
            },
            {{"E", "F", "G", "H"},
            {"E", "F", "G", "H"},
            {"E", "F", "G", "H"}
            },
            {{"I", "J", "K", "K"},
            {"I", "J", "K", "K"},
            {"I", "J", "K", "K"}

            }

        };
        for(String src2[][]: src){
        for(String abcc[] : src2){
        for(String i : abcc){
            System.out.print(i +" ");
        };
            System.out.println();
        };
            System.out.println();
        };
    }

}
