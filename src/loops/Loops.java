/*
 * Gurjit Singh
 * Tuesday October 10th - 2019
 * This program displays the loops
 */

package loops;
import java.util.Scanner;
/**
 *
 * @author gusin5788
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int choice = 0;
        
        System.out.println("Cool Counting Program");
        System.out.println("");
        
        System.out.println("Please enter your choice:");
        System.out.println("1 - If count from 0 to 10 by 1.");
        System.out.println("2 - If count from 100 to 0 by 10.");
        System.out.println("3 - If count from 50 to 500 by 50.");
        System.out.println("4 - If count from 6000 to 1000 by 1000.");
        System.out.println("Please enter your choice:");
        
        choice = in.nextInt();
        
        System.out.println("");
        
        if (choice == 1) {
            System.out.println("You chose to count from 0 to 10 by 1:");
            for (int i = 0; i <= 10; i = i + 1) {
                System.out.println(i);
            }
        }
        else if (choice == 2) {
            System.out.println("You chose to count from 100 to 0 by 10:");
            for (int i = 100; i >= 0; i = i - 10) {
                System.out.println(i);
            }
        }
        else if (choice == 3) {
            System.out.println("You chose to count from 50 to 500 by 50:");
            for (int i = 50; i <= 500; i = i + 50) {
                System.out.println(i);
            }    
        }
        else if (choice == 4) {
            System.out.println("You chose to count from 6000 to 1000 by 1000:");
            for (int i = 6000; i >= 1000; i = i - 1000) {
                System.out.println(i);
            }    
        }
    }
    
}
