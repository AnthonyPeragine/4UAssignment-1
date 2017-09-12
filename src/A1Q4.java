
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create a scanner
        Scanner input = new Scanner(System.in);

        //prompt user for a number between 1 and 10
        System.out.println("Please enter a number between 1 and 10.");
        //print asterisks according to number scanned 
        int number = input.nextInt();
        if (number >= 1 && number <= 10) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("That is not between 1 and 10!");
        }
    }
}
