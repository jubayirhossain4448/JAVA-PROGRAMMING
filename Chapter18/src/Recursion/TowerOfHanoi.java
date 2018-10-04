
package Recursion;
import java.util.Scanner;

public class TowerOfHanoi {
    /**Main method */
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of disks: ");
        int n = input.nextInt();
        
        //Find the solution recursively
        System.out.println("The moves are: ");
        moveDisks(n, 'A', 'B', 'C');
    }
    /** The method for finding the solution to move n disks from fromTower to toTowr with auxTower */
    
    public static void moveDisks(int n, char fromTower, char toTower, char auxTower){
    if (n == 1){
        System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        moveDisks( n - 1, auxTower, toTower, fromTower);
    }else{
    moveDisks(n - 1, auxTower, toTower, fromTower);
        System.out.println("Move disk " + n  + "from" + fromTower + " to " + toTower);
        moveDisks(n - 1, auxTower, toTower, fromTower);
    }
    }
}
