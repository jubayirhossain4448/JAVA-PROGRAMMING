package CheckPoint;

public class ArrayCopy {

    public static void main(String[] args) {
        int sourceArray[] = {2, 6, 8, 5};
        int targetArray[] = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        // Display output
        for (int j : targetArray) {
            System.out.print(j + " ");
        }
        ////// new Array
        int newArray[] = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, newArray, 0, sourceArray.length);
        for (int k : newArray) {
            System.out.print(k + " ");
        }
        System.out.println("==================Array Copy");
        
        int s[]={1,3,5};
        int t[] = new int [10];
        
       System.arraycopy(s, 1, t, 5, 2);
       for (int p : t){
           System.out.print(p + " ");
       }
    }

}
