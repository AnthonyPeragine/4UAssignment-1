
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner
        Scanner input = new Scanner(System.in);

        //create array
        String[] words = new String[10];

        //prompt user for 10 words
        System.out.println("Please enter 10 words (one per line).");
        for (int i = 0; i < 10; i++) {
            words[i] = input.nextLine();
        }
        double average = 0.0;
        double total = 0.0;

        for (int i = 0; i < 10; i++) {
            total = words[i].length() + total;
        }

        average = total / 10;

        System.out.println("The average length of the words entered is " + average + ".");


    }
}
