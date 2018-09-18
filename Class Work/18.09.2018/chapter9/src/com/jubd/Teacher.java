
package com.jubd;
// Setter amd Getter based
// Value ste korbo and get korbo

public class Teacher {
// Step-1 Instance Variable delcare
    
    int id;
    String name;
    String educationQuallification;
    
    // Step-2 Default Constructor Neya (optional)
    // step-3 Take a Main Method or any method (optional)
    
    public void setId(int id) {
        this.id = id;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEducationQuallification(String educationQuallification) {
        this.educationQuallification = educationQuallification;
    }
    

    public static void main(String[] args) {
         Teacher teacher = new Teacher();
         teacher.setId(100);
         teacher.setName("Mr. Jubayir Hossain");
         teacher.setEducationQuallification("MA in English");
         System.out.println("ID: " + teacher.getId());
         System.out.println("Name: " + teacher.getName());
         System.out.println("Education Qualification: " + teacher.geteducationQualification());
    }
    // Step:-4 Create object using default constructoer
   public int getId(){
   return id;
   }
   
   public String getName(){
   return name;
   }
   
   public String geteducationQualification(){
   return educationQuallification;
   }
    
    //Step:5 set value within object
    // step:-6 Print and get value
}
