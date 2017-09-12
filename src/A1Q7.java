/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create variables
        double popn = 6000.0;
        double rate = 0.014;
        double newPopn = 0;
        int year = 1999;

        //perform calculations
        for (int i = 1999; newPopn <= 10000; i++) {
            newPopn = popn + popn * rate;
            popn = newPopn;
            year = i + 1;
        }
        System.out.println("The population will exceed 10 billion in the year " + year);
    }
}
