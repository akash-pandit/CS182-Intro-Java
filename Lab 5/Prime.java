import java.util.Scanner;

/**
 * class Prime
 * 1) initialize bool isPrime, int num, str playAgain, Scanner keyboard
 * 2) prompt user to input number, collect user input with keyboard.nextInt()
 * 3) write method testForPrime
 * 4) set isPrime to the output of testForPrime(num)
 * 5) display whether num is a prime or not
 * 6) put steps 2-4 in do while loop, prompt user if they'd like to continue
 * 7) ???
 * 8) Profit
 * 
 * @author Akash Pandit
 * @version v1.0
 * @since , Akash Pandit, v1.0
 */
public class Prime {
    public static void main (String[] args) {
        boolean isPrime;
        int num;
        String playAgain;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Enter a whole number:");
            num = keyboard.nextInt();
            isPrime = testForPrime(num);

            if (isPrime)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");

            System.out.println("Enter yes to test another number.");
            playAgain = keyboard.next();
        } while (playAgain.equalsIgnoreCase("yes"));
    }

    /**
     * method testForPrime(num):
     * returns a boolean value based on whether its input param is a prime number or not
     *
     * @param num - number we're testing for whether its prime or not
     * @return boolean for whether num is prime or not (true/false)
     */
    public static boolean testForPrime(int num) {
        int halfPlusOne;
        halfPlusOne = num/2+1;
        boolean isPrimeMeth = true;

        for (int i = 2; isPrimeMeth && i <= halfPlusOne; i++) {
            if (num % i == 0) {
                isPrimeMeth = false;
                break;
            }
        }
        return isPrimeMeth;
    }//end testForPrime
}//end Prime