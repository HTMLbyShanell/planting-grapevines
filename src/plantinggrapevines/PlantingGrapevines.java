/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantinggrapevines;

/**
 *
 * @author Shanell A Spann
 * Course: IT-DEV 140  Programming with JAVA
 * Assignment 2
 * Date:  09/26/2020
 * 
 * Description:  This assignment is to complete programming challenges in the
 * Chapter #2 book of "Starting with JAVA, From Control Structures through Objects".
 * ISBN-13 # 978-0-13-480221-3. This program is Programming Challenge # 20: Planting Grapevines. 
 * We are to calculate & display the number of grapevines that will fit in a row
 * after asking a user to input information we can calculate with. 
 */
public class PlantingGrapevines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\t ♥ Chapter 2 - Programming Challenge #20: Planting Grapevines ♥ \n");
        
        grapevines g = new grapevines();
        g.userInput();
        g.calculate();
        g.displayNumberOfGrapeVines();
    }
    
}
