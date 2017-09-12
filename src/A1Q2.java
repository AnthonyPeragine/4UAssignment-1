
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);

        //prompt user for 3 numbers
        System.out.println("Please enter three numbers.");

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextInt();
        }

        //find product of numbers
        int product = numbers[0] * numbers[1] * numbers[2];
        System.out.println("The product of these three numbers is " + product + ".");

        //find the square of the product
        double square = Math.pow(product, 2);
        System.out.println("The square of the product is " + square + ".");

        //find the square root of the product
        double sqrt = Math.sqrt(product);
        System.out.println("The square root of the product is " + sqrt + ".");
    }
}
