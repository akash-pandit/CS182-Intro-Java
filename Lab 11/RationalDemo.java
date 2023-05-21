import java.util.InputMismatchException;

/**
 * class RationalDemo
 * driver class for lab 11, tests out the Rational class built off the RationalInterface interface
 * and a custom exception DivideByZeroException
 * 1) declare and initialize new Rational obj rat1
 * 2) try doRational() for rat1
 *    if catch InputMismatchException, output error msg
 *    if catch DivideByZeroException, output error msg
 * 3) finally print closing msg
 * 4) ???
 * 5) Profit
 */
public class RationalDemo {
    public static void main(String[] args) {
        Rational rat1;
        rat1 = new Rational();

        try {
            rat1.doRational();
        } catch (InputMismatchException e) {
            System.out.println("Please provide a proper integer value.");
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("That's all folks!\n");
        }
    }
}