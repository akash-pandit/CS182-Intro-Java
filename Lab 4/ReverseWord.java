import java.util.Scanner;

/**
 * Description of class ReverseWord
 * 1) initialize strings word & flipped and scanner keyboard, give the user their initial prompt
 * 2) enter a do while loop
 * 3) assign keyboard.next() to word, and enter a while loop that runs until word.equals("quit") but non-case-sensitive
 * 4) set firstLetter as the first char of word, remaining as the rest of the word, and combined as the word with
 *    firstLetter moved to the end (ex. Java -> avaJ)
 * 4) set flipped to an empty string, and add the characters of combined from back to front with a for loop
 *    the indices are inverted by adding 1 and subtracting that total from combined's length
 * 5) if the word.equals(flipped), print success message, otherwise print failure message
 * 6) prompt user to continue to next line, while loop checks if next input in lowercase is "yes" and continues if so
 * 7) ???
 * 8) Profit
 *
 * @author Akash Pandit
 * @version v1.0
 * @since 3/4/2023, Akash Pandit, v1.0
 */
public class ReverseWord { 
    public static void main (String[] args){
        String word, flipped, remaining, combined;
        char firstLetter;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter words separated by a space ending with the word quit");
        
        do {
            word = keyboard.next();
            while (!word.equalsIgnoreCase("quit")) {
                flipped = "";

                firstLetter = word.charAt(0);
                remaining = word.substring(1);
                combined = remaining + firstLetter;

                for (int i = 0; i < combined.length(); i++)
                    flipped += combined.charAt(combined.length() - (i + 1));

                if (word.equals(flipped))
                    System.out.println(flipped + " works!");
                else
                    System.out.println(word + " does not work :(");

                word = keyboard.next();
            }

            System.out.println("Enter yes to process another line?");
        } while (keyboard.next().equalsIgnoreCase("yes"));

    }////end main ()
}////end class