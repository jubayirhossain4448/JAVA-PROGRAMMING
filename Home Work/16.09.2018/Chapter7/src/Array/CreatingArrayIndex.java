
package Array;

public class CreatingArrayIndex {
    public static void main(String[] args) {
        double myList[] = new double[10];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.0;
        myList[6] = 34.33;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        System.out.println("Example of Array: " + myList[5]);
        
        for (int i = 0; i<myList.length; i++){
        myList[i] = i;
            System.out.println(" The total of Array is: " + i);
        }
    }
    
}
