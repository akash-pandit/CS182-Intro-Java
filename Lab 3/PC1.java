import java.util.Scanner;

/**
 * PC1 converts an integer number 1, 2, or 3, to its roman numeral equivalent.
 * 1) initialize numberToConvert (what stores the user input) as an int
 * 2) initialize scanner object keyboard
 * 3) prompt user for a number input
 * 4) use keyboard to collect user input and save it to numberToConvert
 * 5) run a switch statement on numberToConvert, running the associated switch case or a default case if no matches
 * 6) ???
 * 7) Profit
 * 
 * @author Akash Pandit, optional email
 * @version v1.0
 * @since 2/25/23, Akash Pandit, v1.0
 */
public class PC1 {
    public static void main (String[] args){
        //create an int to be used for the switch
        int numberToConvert;
        //Create a Scanner object tied to the keyboard
        Scanner keyboard = new Scanner(System.in);
        //Message to the user, what do you want them to enter
        System.out.println("Please input a number to be converted to a roman numeral. " +
                "It should be anywhere from 1 to 3.");
        //Use Scanner object to assign value to int created above
        numberToConvert = keyboard.nextInt();
        
        switch(numberToConvert){
            case 1:  // if the number given is 1
                System.out.println("1 as a roman numeral is 'I'.");
                break;
            case 2:  // if the number given is 2
                System.out.println("2 as a roman numeral is 'II'.");
                break;
            case 3:  // if the number given is 3
                System.out.println("3 as a roman numeral is 'III'.");
                break;
            default:  // the 'else' case
                System.out.println(numberToConvert + " Is not a valid number, it must be between 1 and 3 (inclusive).");
                break;
        }
    }
}