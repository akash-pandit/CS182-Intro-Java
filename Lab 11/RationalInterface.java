import java.util.InputMismatchException;

/**
 * interface that provides a skeleton for the Rational class
 * provides method skeletons for handling, for gathering user input, and for calculating
 * a division if the result is valid
 */
public interface RationalInterface {
    /**
     * skeleton for doRational method
     * @throws InputMismatchException for bad scanner input
     * @throws DivideByZeroException if dividing by 0 (invalid math operation)
     */
    void doRational() throws InputMismatchException, DivideByZeroException;

    /**
     * skeleton for a method to gather user input and return it if its an integer
     * @return given user input (int)
     * @throws InputMismatchException if invalid item passed to scanner
     */
    int setUserInput() throws InputMismatchException;

    /**
     * skeleton for a method to divide 2 values if the result is rational
     * @return the result of the calculation
     * @throws DivideByZeroException if the denominator is 0 (which would lead to an undefined return val)
     */
    double calcRational() throws DivideByZeroException;
}