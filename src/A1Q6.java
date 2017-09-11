
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner 
        Scanner input = new Scanner(System.in);

        //create variables
        int number = 100;

        System.out.println("Please enter a number between 50 and 100 to stop at.");
        int end = input.nextInt();

        if (end >= 50 && end <= 100) {
            System.out.println(number);
            while (end < number) {
                number = number - 5;
                System.out.println(number);
                if (number - 5 < end) {
                    break;
                }

            }
        }
    }
}
