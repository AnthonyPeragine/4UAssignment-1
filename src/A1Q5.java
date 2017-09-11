
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);

        //prompt user for a number between 1 and 10
        System.out.println("Please enter a number between 1 and 10.");
        //print asterisks according to number scanned in
        int number = input.nextInt();
        if (number >= 1 && number <= 10) {
            for (int a = 0; a < number; a++) {
                for (int i = 0; i < number; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}
