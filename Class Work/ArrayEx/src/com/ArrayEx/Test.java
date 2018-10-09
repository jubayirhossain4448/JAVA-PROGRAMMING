package com.ArrayEx;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] s = new int[4];
        s[0] = 12;
        s[1] = 13;
        s[2] = s[0] + s[1];
        s[3] = s[0] + s[1] + s[2];
        System.out.println("Array: " + s[3]);
        System.out.println(Arrays.asList(s));
    }

}
