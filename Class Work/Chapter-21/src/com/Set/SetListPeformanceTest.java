package com.Set;

import java.util.*;

public class SetListPeformanceTest {

    static final int N = 50000;

    public static void main(String[] args) {
        // Add numbers 0, 1, 2, ...................... N - 1 to the array list 
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
            Collections.shuffle(list); // Shuffle the array list

            // Create a hash set, and test its performance
            Collection<Integer> set1 = new HashSet<>(list);
            System.out.println("Member test time for hash set is " + getTestTime(set1) + "milliseconds");
            System.out.println("Remove element time for hash set is " + getRemoveTime(set1 + "milliseconds"));
            
            //Create linked hash set, and test its performance
            Collection<Integer> set2 = new LinkedHashSet<>(list);
            System.out.println("Member test time for linked hash set is " + getTestTime(set2) + "milliseconds");
        }

    }

    private static String getTestTime(Collection<Integer> set1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String getRemoveTime(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
