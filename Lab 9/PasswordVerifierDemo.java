import java.util.Scanner;
/**
 * class PasswordVerifierDemo
 * driver class for PasswordVerifier, gathers input from stdin and tests the password for validity,
 * looping until the user is satisfied
 * 
 * @author Akash Pandit (aspandit@ucsc.edu)
 * @since v1.0, 5/5/2023 
 */
class PasswordVerifierDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordVerifier validPassword;

        do {
            // prompt user for password
            System.out.println("\nEnter a password, to check.");
            System.out.print("Valid passwords are 8+ chars have upper case, lower case, and a number: ");

            // create password object
            validPassword = new PasswordVerifier(scanner.nextLine());

            // validate password
            if (validPassword.testPassword() == true) {
                System.out.println("Password entered is valid");
            } else {
                System.out.println("Password entered is not valid");
            } 
            // prompt user to continue
            System.out.print("Enter yes to check another password: ");
        } while (scanner.nextLine().equals("yes"));
        scanner.close();
    }
}