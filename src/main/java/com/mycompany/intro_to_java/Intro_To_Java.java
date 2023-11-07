/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intro_to_java;

import java.util.Scanner;

/**
 *
 * @author SHEEVZ
 */
public class Intro_To_Java {

    //6 Fundamentals
    /*
    inputs
    outputs
    loops
    conditions
    operations
    variables
    collections(arrays)
    */
    
    // Crtl + / comments out

    public static void main(String[] args) {
        
        //System.out.println(""); is Console.WriteLine(); Shortcut sout *tab*
        System.out.println("Please enter your name");//Output
        
        //KNOW THIS LINE FOR GETTING INPUT
        //intellisense to import scanner
        Scanner scanner = new Scanner(System.in);//input
        
        //String userInput = scanner.nextLine(); is Console.Readline();
        String userInput = scanner.nextLine();
        System.out.println("Hello, " + userInput);
        //int userColor = scanner.nextInt(); is Console.Readline(); but  int input rather than string
        //IMPORTANT NOTE
        //if you use scanner for anything other than a string, call scanner.NextLine(); to flush scanner
        //methods start with lowercase instead of uppercase
        //Lists are 
        //ArrayList<String> names = new ArrayList<String>();
    }
}
