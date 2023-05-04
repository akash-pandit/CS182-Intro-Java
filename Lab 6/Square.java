import java.util.Scanner;

/**
 * class Square
 * a class file for constructing a square object with methods for posting output, getting input,
 * setting the name and side length, and getting the perimeter.
 *
 * @author Akash Pandit
 * @version v1.0
 * @since 3/25/2023
 */

public class Square {
    private String name;  // field that holds the square's name, hidden from users
    private double side;  // field that holds the square's side length, hidden from users

    /**
     * constructor for creating a square object with empty parameters
     * the square is initialized with name "Nothing" and side length 0.0
     */
    public Square() {
        name = "Nothing";
        side = 0.0;
    }

    /**
     * constructor for creating a square object with parameters for name and side length
     * (units assumed to be equivalent for all units of measurement)
     * @param inName - the name of the square
     * @param inSide - the length of one of the sides of the square (equal for all sides)
     */
    public Square(String inName, double inSide) {
        name = inName;
        side = inSide;
    }

    /**
     * method postOutput: Prints the square's name, side length, and perimeter to standard output (console)
     */
    public void postOutput() {
        System.out.println("Name: " + name);
        System.out.println("Side length: " + side);
        System.out.printf("Perimeter: %.2f", getPerimeter());
    }

    /**
     * method getInput: create a scanner object and use it to collect user input for both the square's
     * name and the square's side length
     */
    public void getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Square's name: ");
        name = input.nextLine();
        System.out.print("Enter the Square's side length: ");
        side = input.nextDouble();
    }

    /**
     * method setName: sets the name of a square object
     * @param newName - the new name of the square object
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * method setSide: sets the side length of a square object
     * @param newSide - the new side length of the square object
     */
    public void setSide(double newSide) {
        side = newSide;
    }

    /**
     * method getPerimeter: an internal method that calculates and returns the perimeter of a square object
     * @return the perimeter of the square, defined by the equation 4 * side
     */
    private double getPerimeter() {
        return side * 4;
    }
}
