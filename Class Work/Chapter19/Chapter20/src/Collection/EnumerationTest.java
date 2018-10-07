
package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
    public static void main(String args[]){
Enumeration days;
Vector dayNames =newVector();
dayNames.add("Sunday");
dayNames.add("Monday");
dayNames.add("Tuesday");
dayNames.add("Wednesday");
dayNames.add("Thursday");
dayNames.add("Friday");
dayNames.add("Saturday");
days = dayNames.elements();
while(days.hasMoreElements()){
System.out.println(days.nextElement());
}
}

    private static Vector newVector() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
