package ArrayExample;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int x[] = {5, 8, 7, 55, 1, 369, 55555, 98, 01, 37, 100};// Length 3
        // index 
        Arrays.sort(x);
        int newArray[] = new int[x.length];
        int j = 0;
        for (int i = x.length - 1; i >= 0; i--) {
            newArray[j] = x[i];
            j++;
        }
        for (int k : newArray) {
            System.out.println(k + " ");
        }
    }

}
