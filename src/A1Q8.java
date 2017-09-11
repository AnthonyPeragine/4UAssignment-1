
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //create variables
        double value = 0;
        int years = 0;
        
        //prompt user for needed values
        System.out.println("Please enter the priciple amount in the account.");
        double p = input.nextDouble();
        
        System.out.println("Please enter the decimal percentage rate at which it grows anually.");
        double rate = input.nextDouble();
        
        value = p;
        while(value < p * 2){
            value = (1 + rate) * value;
            years++;
        }
        System.out.println("The value will double after " + years + " years.");
        
    }
}
