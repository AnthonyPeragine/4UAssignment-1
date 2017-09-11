
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner 
        Scanner input = new Scanner(System.in);

        //ask user for cost of food
        System.out.println("What is the cost for the food?");
        double food = input.nextDouble();

        //ask user for cost of DJ
        System.out.println("What is the cost for the DJ?");
        double dj = input.nextDouble();

        //ask user for cost of hall
        System.out.println("What is the cost for the hall?");
        double hall = input.nextDouble();

        //ask user for cost of decorations
        System.out.println("What is the cost for the decorations?");
        double decor = input.nextDouble();

        //ask user for cost of wait staff
        System.out.println("What is the cost for the wait staff?");
        double staff = input.nextDouble();

        //ask user for cost of misc expenses
        System.out.println("What is the cost for the miscellaneous expenses?");
        double misc = input.nextDouble();
        
        //calculate how many tickets must be sold and then display answer
        int ticket = 0;
        double cost = food + dj + hall + decor + staff + misc;
        int ticketAmount = 0;
        
        while(ticket < cost){
            ticket = ticket + 35;
            ticketAmount = ticketAmount + 1;
        }
        System.out.println("The number of tickets you must sell is " + ticketAmount + ".");
    }
}
