
package com.array;

public class ArrayDeclaration {
    // Array index starts from 0 (Zero)
    // Array is Fixed in size
    // Array performance is good
    // Array works with homogenious (same type like int or 
    // Or String or double data
    // Array Declaretion
   
   // int []y = new int [3]; // not Good
    int z [] = new int [5];
    public static void main(String[] args) {
        int [] x = new int [2]; // Here 2 is size (Length) of the Array x
        x [0] = 10;
        x [1] = 25;
        System.out.println("x[0]: " +x[0]);
        System.out.println("x[1]: " +x[1]);
        //System.out.println("x[2]: " +x[2]); //wrond; if wr use any index o
        
        for (int i : x){
        
            System.out.println(i);
        }
        // Alternative way Array Declaretion 
        int p [] = {10, 25, 35, 23, 14, 27, 42, 11};
        // Index     0  1   2   3   4   5   6   7
        System.out.println("Length of p is: " + p.length);
        System.out.println("p[5]: " + p[5]);
        for (int i : x){
        
            System.out.println(i);
        }
        p = new int [9];
        for (int j : p){
            System.out.println(j);
            System.out.println("Length of p: " + p.length);
        }
    }
}
