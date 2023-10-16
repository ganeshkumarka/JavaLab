/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp10;

/**
 *
 * @author cusat
 */
public class Association {
    public static void main(String[] args) {
        Pet p1 = new Pet("Dog", "Jack", "Doberman");
        Pet p2 = new Pet("Cat", "Kitty", "Persian");
        Eyes eye = new Eyes("medium", "blue",false);
        Person man = new Person("Ganesh",625,eye, p1, p2);
        man.printPetDetails();
        
    }
    
}
class Pet
{
    String type;
    String name;
    String breed;

    public Pet(String type, String name, String breed) {
        this.type = type;
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        
        String msg = "\nType : "+type+"\nName : "+name+"\nBreed : "+breed;
        return msg; //To change body of generated methods, choose Tools | Templates.
    }
    
}
class Eyes
{
    String size;//large,medium,small
    String color;//black,brown,blue,green,ash
    Boolean defected;

    public Eyes(String size, String color, Boolean defected) {
        this.size = size;
        this.color = color;
        this.defected = defected;
    }
    
}
class Person
{
   String name;
   Eyes eyes;
   int SSID;
   Pet pet1,pet2;

    public Person(String name, int SSID, Eyes eyes, Pet pet1, Pet pet2) {
        this.name = name;
        this.SSID = SSID;
        this.eyes = eyes;
        this.pet1 = pet1;
        this.pet2 = pet2;
    } public void printPetDetails(){
        
        System.out.println(pet1);
        System.out.println(pet2);
    
    }
}
