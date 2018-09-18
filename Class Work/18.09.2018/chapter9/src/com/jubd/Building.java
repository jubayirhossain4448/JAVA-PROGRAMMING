
package com.jubd;


public class Building {
    int id;
    String name;
    String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public static void main(String[] args) {
        Building building1 = new Building();
        building1.setId(500);
        building1.setName("Mehdee");
        building1.setLocation("Dhaka");
        System.out.println("The details of Hasina is : " + building1.getId());
        System.out.println("The details of Hasina is : " + building1.getName());
        System.out.println("The details of Hasina is : " + building1.getLocation());
    }
    
}
