
package ArrayExample;
import com.method.ArrayAsemethodArgument;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] x = {8, 9, 4, 1, 6, 7, 5, 11, 48, 21,48};// 11 element
        Arrays.sort(x,3,7);
        ArrayAsemethodArgument.displayArray(x);
    }
    
}
