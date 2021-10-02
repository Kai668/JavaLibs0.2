/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibs;

import java.util.Scanner;

/**
 *
 * @author Radmike
 */
public class JavaLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String name = keyboardInput.nextLine();
        
        System.out.println("Enter color: ");
        String color = keyboardInput.nextLine();
        
        System.out.println("Enter verb: ");
        String verb = keyboardInput.nextLine();
        
        System.out.println("Enter noun: ");
        String noun = keyboardInput.nextLine();
        
        System.out.println("Enter Name: ");
        String Name = keyboardInput.nextLine();
        
        System.out.println("Enter number: ");
        String number = keyboardInput.nextLine();
        
        System.out.println("My name is " + name);
        System.out.println("I really like the color " + color);
        System.out.println("My favorite thing to do is " + verb);
        System.out.println("My favorite place to go on the weekends is " + noun);
        System.out.println("I might have a crush on " + Name);
        System.out.println("My favorite numer is " + number);
    }
    
}
