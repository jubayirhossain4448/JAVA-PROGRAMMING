package NestedLoop;

public class NestedLoopEx {

    public static void main(String[] args) {
        // Display the table heading
        System.out.println("Multiplicatioin Table");

        // Display the number title
        System.out.println("  ");
        for (int j = 1; j <= 9; j++) 
            System.out.println("  " + j);
        

        System.out.println("\n----------------------------");

        // Display table body
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " | ");
            for (int j = 1; j <= 9; j++) {
                //Display the product and align properly
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

}
