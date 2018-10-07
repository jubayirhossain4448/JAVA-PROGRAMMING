
package Collection;
import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Dhaka");
        collection.add("Khulna");
        collection.add("Mohammadpur");
        collection.add("Magura");
        
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase() +  " ");
        }
        System.out.println();
    }
    
}
