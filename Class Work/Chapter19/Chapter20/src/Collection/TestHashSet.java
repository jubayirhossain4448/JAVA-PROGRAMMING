
package Collection;

import java.util.HashSet;
import java.util.Set;


public class TestHashSet {
    public static void main(String[] args) {
        // Create a hash set
        
        Set<String> set = new HashSet<>();
        
        // Add Strings to the set
        set.add("Dhaka");
        set.add("Khulna");
        set.add("Dhanmondi");
        set.add("Mohammadpur");
        set.add("Mirpur");
        set.add("MogBazar");
        
        System.out.println(set);
        
        // Display the elements in the hash set
        for(String s : set){
            System.out.println(s.toUpperCase() + "");
        }
    }
    
}
