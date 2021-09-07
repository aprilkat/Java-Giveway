/*
 * Author:   April Bollinger
 * Date:     06/19/2020
 * Name:     April's Big Giveaway
 * Purpose:  To use selection structures
 */
package giveaway;
// Scanner to get input
import java.util.Scanner;
// Error trap
import java.util.InputMismatchException;




// Main calls some other methods
public class Aprils_giveaway{
    public static void main(String[] args) {
        // create Scanner object
       Scanner sc = new Scanner(System.in);
       // initilize variables
       String answer = "y";
       String name = "";
       int choice = 0;
       // call getName on line 68
       name = getName(sc, name);
       // entering loop
       while(answer.equalsIgnoreCase("y")) { 
           // try and catch
            try{
                // input to be tested
                System.out.println("You have three choices: Door 1, 2 or 3 ");
                choice = sc.nextInt();
                // enter catch
                }catch(InputMismatchException e){
                    // error message
                    System.out.println("Error! Invalid number. Please try again.  \n");
                    sc.nextLine();
                    // goes back to the beginning of the loop to retry
                    continue;
                }
            // selection structure
            if (choice == 1)
                System.out.println("Congratulations " + name +"! You won a trip to Greece.");
              
            else if (choice == 2)
                System.out.println("Congratulations " + name + "! You won a million dollars.");
            
            else if (choice == 3)
                System.out.println("Congratulations " + name + "! You won a brand new truck.");
            
            else {
                System.out.println("I could not understand you.");
            }
            
            System.out.print("Do you want to play again? (y/n) ");
            answer = sc.next();
            System.out.println();
            // call clear screen on line 76
            clearScreen();
            

       }
       // exit message
       System.out.print("Thank you for playing! \nGoodbye.\n");
    }
    // get name to make it more personal
     public static String getName(Scanner sc, String name){
        System.out.println("Welcome to April's Big Giveaway!");
        System.out.print("What is your name? ");
        name = sc.nextLine();
        System.out.println("Hello, " + name + ".");
        return name;
    }
    // clear screen      
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }   
       
       
       
       
       
       
       
       
       
       
       
       
       
       
}
