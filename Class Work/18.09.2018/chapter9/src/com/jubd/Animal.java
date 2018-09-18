
package com.jubd;

// Class is a blue print of Object

public class Animal {
    String name;
    String color;
    double age;
    String race;

    public Animal() {
    }
    
    public Animal(String name, String color, double age, String race) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.race = race;
    }
    
   
     // Animal object's Behavior
    void bite (){
    
    }
    void eat(){
    
    }
    void run(){
    
    }
    void walk(){
    }
    void bark(){
    }
    public static void main(String[] args) {
        Animal tommy = new Animal();
        
        Animal jerry = new Animal();
        
        Animal mew = new Animal("Mr.Mini", "white" , 5, "American");
        System.out.println(mew);
        
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", color=" + color + ", age=" + age + ", race=" + race + '}';
    }
    
}
