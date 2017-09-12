
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);

        //Prompt user to enter words and to finish entering words by entering "exit".
        System.out.println("Please enter words (one per line) and when you are finished, enter the word");
        System.out.print("exit");
        System.out.println("\n" + "as shown on screen.");

        String word = input.nextLine();

        //create variable for total words
        int total = 0;
        while (word.equals("exit") == false) {
            total++;
            word = input.nextLine();
            if (word.equals("exit") != false) {
                break;
            }
        }

        System.out.println("The amount of words entered is " + total + ".");
    }
}
