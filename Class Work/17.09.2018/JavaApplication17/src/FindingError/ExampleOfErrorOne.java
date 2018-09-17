
package FindingError;


public class ExampleOfErrorOne {
    public static void main(String[] args) {
       
        double x[]= new double[100];
        for (int i = 0; i<x.length; i++){
        x[i] = Math.random() * 100;
            System.out.printf("The result of x[%d] is: %f \n",i ,x[i]);
        }
        
    }
    
}
