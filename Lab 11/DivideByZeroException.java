/**
 * the class DivideByZeroException inherits from Exception that throws
 * an error when division by 0 is attempted. This operation is prohibited in math, giving an
 * undefined output.
 */
public class DivideByZeroException extends Exception {
    /**
     * constructor to throw a DivideByZeroException with the default error message
     */
    public DivideByZeroException() {
        super();
    }

    /**
     * constructor to throw a DivideByZeroException with a custom error message
     * @param errString your custom error message
     */
    public DivideByZeroException(String errString) {
        super(errString);
    }
}