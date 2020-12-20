/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantinggrapevines;

import java.util.Scanner;

/**
 *
 * @author Shanell Spann
 */
public class grapevines {
    int lengthOfRow;
    int endPostSpace;
    int spaceBetweenVines;
    int numberOfGrapeVines;
    Scanner keyboard = new Scanner(System.in);
    
    public void userInput()
    {
        System.out.print("Enter the length of your grapevine row, in feet: ");
        lengthOfRow = keyboard.nextInt();
        System.out.print("Enter the amount of space the end-posts need, in feet: ");
        endPostSpace = keyboard.nextInt();
        System.out.print("Enter the amount of space bewteen the vines, in feet: ");
        spaceBetweenVines = keyboard.nextInt();
    }
    
    public void calculate()
    {
        numberOfGrapeVines = (lengthOfRow - 2 * endPostSpace) / spaceBetweenVines;  
    }
    
    public void displayNumberOfGrapeVines()
    {
       System.out.println("The Number of Grapevines That Will Fit in the Row = " + numberOfGrapeVines);
    }
}
