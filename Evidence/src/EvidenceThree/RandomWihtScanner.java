
package EvidenceThree;
import java.util.*;

public class RandomWihtScanner {
    public static void main(String[] args) {
        Random rand = new Random(100);
        Set<Integer> unique= new HashSet();
        
        for(int i =1; i<=10; i++){
        int num = rand.nextInt(50) + 50;
        unique.add(num);
        }
        for(int i : unique){
            System.out.println(i + "");
        }
    }
    
}
