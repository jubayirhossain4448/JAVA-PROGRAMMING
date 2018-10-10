
package com.ImplementingListsStackQueuesPriorityQueues;

import java.util.Spliterator;
import java.util.function.Consumer;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<String>() {
            @Override
            public void forEach(Consumer<? super String> action) {
                super.forEach(action); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Spliterator<String> spliterator() {
                return super.spliterator(); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        list.add("America");
        System.out.println("(1) " + list);
        
        list.add(0, "Canada");
        System.out.println("(2) " + list);
        
        list.add("Russia");
        System.out.println("(3) " + list);
        
        list.add("France");
        System.out.println("(3) " + list);
        
        list.add(2, "Germany");
        System.out.println("(5) " + list);
        
        list.add(5, "Norway");
        System.out.println("(6) " + list);
        
        list.remove("Canada");
        System.out.println("(7) " + list);
        
        list.remove(2);
        System.out.println("(8) " + list);
        
        list.remove(list.size() - 1);
        System.out.println("(9) " + list + "\n(10)");
        
        for (String s : list){
            System.out.println(s.toUpperCase() + " ");
        }
    }
    
}
