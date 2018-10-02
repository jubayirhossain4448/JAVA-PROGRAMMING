package InheritancePloymorphism.ex2;

import InheritancePloymorphism.*;

/* 
B class is inheritance A class, so
A is Supper class and B is sub class or
A is parent class and B is child class
 */
public class B extends A {
double salary;

    public B() {
    }

    public B(double salary) {
        this.salary = salary;
    }

    public B(double salary, int id, String name, String color) {
        super(id, name, color);
        this.salary = salary;
    }


}
