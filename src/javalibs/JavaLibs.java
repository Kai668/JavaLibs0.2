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
        
        System.out.println("Hi I'm " + name);
        System.out.println("Let me tell you some stuff about me. First, I think the BEST color in the world is " + color);
        System.out.println("I really like to " + verb);
        System.out.println("You'll see me mostly hanging out at " + noun);
        System.out.println("I may or may not have a slight crush on " + Name);
        System.out.println("The number I think is really cool is " + number);
    }
    
}
