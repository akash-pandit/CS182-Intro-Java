import java.util.Scanner;

/**
 * PC12 (Prog Chall 12)
 * 1) get city from user input
 * 2) print len of input
 * 3) print UPPERCASE and lowercase of input
 * 4) print first char of input
 *
 * @author Akash Pandit
 * @version v1.0
 * @since 12/18/2023, Akash Pandit, v1.0
*/

public class PC12 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a city: ");
        String city = input.nextLine();
        System.out.println("\nThe city entered has: " + city.length() + " chars");
        System.out.println("In upper case: " + city.toUpperCase() + "\nIn lower case: " + city.toLowerCase());
        System.out.println("First character: " + city.charAt(0));
    }
}
