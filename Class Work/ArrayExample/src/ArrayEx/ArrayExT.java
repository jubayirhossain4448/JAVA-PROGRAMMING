package ArrayEx;
import java.util.*;
public class ArrayExT {

    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        
        for(int i = 0; i<sourceArray.length; i++){
            System.out.println("Result of Coping Array: " + targetArray[i]);
        }

    }

}
