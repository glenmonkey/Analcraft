import java.util.Random;
import java.util.Scanner;

// the file can be retrieved at /home/usr/glen/prac/Analcraft.java
public class Analcraft {
    
    // String Array COLOR_LIST is declared static - accessible anywhere
    static String[] COLOR_LIST = new String[] { "Amber", "Aqua", "Auburn", 
            "Bronze", "Brown", "Beige", "Black", "Blue", "Cream", "Crimson", 
            "Cyan", "Emerald", "Fuchsia", "Gold", "Gray", "Green", "Ivory", 
            "Maroon", "Navy", "Olivedrab", "Orange", "Pink", "Purple", 
            "Rainbow", "Turquoise", "Violet", "White", "Yellow" };
    
    // int 'i' and 'count' declared static for the same reason
    static int i, count = 0;
    
    /** printColors() method created to print values in the String[] array
     *  5 words will be printed per line
     */
	public static void printColors() {
        // 'for' loop is utilized as the total number of values is known.
        for (i = 0; i < COLOR_LIST.length; i++) {
            System.out.print(COLOR_LIST[i] + " ");
            count++;

            if (count == 5) {
                    System.out.print("\n");
                    count = 0;
            }
        }
    }

	public static void anyKey() { 
	System.out.println("\nPress 'Enter' to continue...");

          try {
            System.in.read();
          }  
        
	  catch(Exception e) {
          }  
 	}	
    
    public static void main(String[] args) {
        // Scanner() method to allow user inputs
	Analcraft enterIt = new Analcraft();

        Scanner GuessMe = new Scanner(System.in);
        System.out.println("- Analcraft - v 1.0.1"
                + "\nPasteright (p)  2016 -  Glen The American -"
                + "\n CHICAGO CUBS "
        	+ "\n Enquiry : glen.mt.pot@gmail.com "
		+ "\n----------------- ");
	Analcraft.anyKey();

        System.out.print("Please enter your given name : ");
        
        
        String name = GuessMe.next();
        System.out.println("\nHello, " + name + "!"
                + "\n\nNow, " + name + ", your objective is to guess the "
                + "\ncolor of my anus by choosing the correct one from list "
                + "\nwhich will be provided shortly. ");
	Analcraft.anyKey();
	System.out.println("\nFYI, since the color of my anus varies depending " 
		+ "\non my daily mood, you will have to select a number of "
                + "\ndifferent colors to get to know my anus better. "
	       	+ "\n\nNow, " + name + ", Do you wish to continue?");
	
        System.out.print("Yes / No : ");
        
        
        String answerit = GuessMe.next();
        Analcraft anal = new Analcraft();
        if (answerit.equalsIgnoreCase("yes")) {
            System.out.println("\n\nGreat! Here is the list of colors below"
                    + "\n");
            Analcraft.printColors();
        }
            else {
               System.out.println("Well, fuck off!");
               System.exit(0);
            }
        
        
        System.out.println("\n"
                + "\nType 'list' and press Enter "
                + "anytime to retrieve the color list."
                + "\nTo exit this game, type 'exit' anytime and "
                + "press Enter"
                + "\nYour answers do not need to be case-sensitive :)");
        System.out.print("Now, " + name + ", guess what the color of my "
                + "anus is : ");
        
        
        // int/String variables declared to be used in boolean and while loop
        Random randomColorArray = new Random();
        int computerChosen = randomColorArray.nextInt(COLOR_LIST.length);
       
        /*  The following 'int yourTries' variable will display the total 
         *  number of attempts that the player will have made. 
         *  Since this program will display the total number of 'failures',
         *  new integer 'int finalTries' will be declared immediately 
         *   after the while loop.
         */
        int yourTries = 0;
        String random1 = (COLOR_LIST[computerChosen]);
        String finalAnswer;
        
        boolean win = false;
        while (win == false) {
            Scanner answerColorNow = new Scanner(System.in);
            finalAnswer = answerColorNow.next();
            System.out.println("");
            
       
            if (finalAnswer.equalsIgnoreCase(random1)) {
                System.out.println("\nCorrect! Well Done! You chose " 
                    + random1 + "!");
                win = true;
            }
                else if (finalAnswer.equalsIgnoreCase("Exit")) {
                    System.out.println("Well, fuck off!");
                    System.exit(0);
                }
            
                else if (finalAnswer.equalsIgnoreCase("list")) {
                    Analcraft.printColors();
                    System.out.print("\nTry again: ");
                    win = false;
                }
                
                else {
                    System.out.println(finalAnswer + " ? ");
                    System.out.print("\nIncorrect! Try another color : ");
                    yourTries++;
                    win = false;
                }
        }
        
        // Total Tries - 1 will display total number of failed tries.
        int finalTries = yourTries - 1;
        System.out.println("\nYou have failed " + finalTries + " times.");
        System.out.println("\nStayin' Alive"); 
    }
}
    
    
