import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * class Rational implements RationalInterface
 * provides methods for parsing rational numbers
 */
public class Rational implements RationalInterface {
    int numerator;
    int denom;
    double result;
    Scanner scan = new Scanner(System.in);
    
    /**
     * empty constructor
     * numerator = 0
     * denominator = 0
     * result = 0.0
     */
    Rational() {
        numerator = 0;
        denom = 0;
        result = 0.0;
    }

    /**
     * sets the numerator & denominator, calculates the result, and prompts user to continue
     * @throws InputMismatchException if invalid item passed to scanner
     * @throws DivideByZeroException if denominator is set to 0 leading to an undefined result
     */
    public void doRational() throws InputMismatchException, DivideByZeroException {
        String cont;
        do {
            System.out.print("(Numerator) ");
            numerator = setUserInput();
            scan.nextLine();
            System.out.print("(Denominator) ");
            denom = setUserInput();
            scan.nextLine();

            result = calcRational();
            System.out.printf("With numerator %d and denominator %d, the result is %.3f\n", numerator, denom, result);
            System.out.print("Would you like to calculate another number? y/Y = yes, else no: ");
            cont = scan.nextLine().toLowerCase();
            if (cont.equals("y")) {
                System.out.println();
            }
        } 
        while (cont.equals("y"));
    }

    /**
     * gathers and returns user integer input
     * @return given user input (int)
     * @throws InputMismatchException if invalid item passed to scanner
     */
    public int setUserInput() throws InputMismatchException {
        System.out.print("Input an integer: ");
        return scan.nextInt();
    }

    /**
     * calculates the value of numerator / denominator if that is a valid operation
     * @return the result of the calculation
     * @throws DivideByZeroException if the denominator is 0 (which would lead to an undefined return val)
     */
    public double calcRational() throws DivideByZeroException {
        if (denom == 0) {
            throw new DivideByZeroException("Please provide a denominator value that is not 0, n/0 where n is a real number is an illegal operation.");
        }
        return (double) numerator / denom;
    }
}