
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter name
        System.out.println("Please enter your name.");
        
        //get input from user
        String name = input.nextLine();
        
        //output Hello + name
        System.out.println("Hello " + name + "!");
    }
}
