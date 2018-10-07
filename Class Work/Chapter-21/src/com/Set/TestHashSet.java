
package com.Set;
import java.util.*;

public class TestHashSet {
    public static void main(String[] args) {
        // Create a hash set
        Set<String> set = new HashSet<>();
        
        // Add Strings to the set
        set.add("Dhaka");
        set.add("Khulna");
        set.add("Magura");
        set.add("Bogura");
        set.add("Kumilla");
        set.add("Sylhet");
        
        System.out.println(set);
        
        // Display the elements in the hash set
        for(String s : set){
            System.out.println(s.toUpperCase() + " ");
        }
    }
    
}
