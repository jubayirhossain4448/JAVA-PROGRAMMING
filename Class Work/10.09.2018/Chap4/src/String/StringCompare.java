/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;


public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Bangladesh";
        String str2 = "India";
        if(str1 == str2){
        System.out.println("True");
        
        }else{
            System.out.println("False");
        }
        // way 2
        if (str1.equals(str2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
     
    }
    
}
