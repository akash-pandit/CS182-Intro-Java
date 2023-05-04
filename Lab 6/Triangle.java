import java.util.Scanner;

/**
 * class Triangle
 * a class file for constructing a triangle object with methods for setting dimensions,
 * taking input, giving output, and calculating area.
 *
 * @author Akash Pandit
 * @version v1.0
 * @since 3/16/2023
 */
class Triangle {
    private String name;  // field that holds the triangle's name, hidden from users
    private double base;  // field that holds the triangle's base length, hidden from users
    private double height;  // field that holds the triangle's height, hidden from users

    /**
     * constructor for creating a triangle object with empty parameters
     * the triangle is initialized with name unknown, base 0.0, and height 0.0
     */
    public Triangle() {
        name = "Unknown";
        base = 0.0;
        height = 0.0;
    }

    /**
     * constructor for creating a triangle object with parameters
     * (units assumed to be equivalent for all units of measurement)
     * @param name_ = the name of the triangle
     * @param base_ = the base length of the triangle
     * @param height_ = the height of the triangle
     */
    public Triangle(String name_, double base_, double height_) {
        name = name_;
        base = base_;
        height = height_;
    }

    /**
     * method writeOutput: outputs triangle name, base, height, and area (calculated with getArea method)
     * to stdin (console)
     */
    public void writeOutput() {
        System.out.println("Triangle name: " + name);
        System.out.println("Triangle base length: " + base);
        System.out.println("Triangle height: " + height);
        System.out.printf("Triangle area: " + "%.1f", getArea());
    }

    /**
     * method readInput: gathers user input w/ scanner object and assigns values to name, base, and height
     */
    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the triangle name: ");
        name = keyboard.nextLine();
        System.out.println("Enter the triangle base length: ");
        base = keyboard.nextDouble();
        System.out.println("Enter the triangle height: ");
        height = keyboard.nextDouble();
    }

    /**
     * method setName: sets the name of a triangle
     * @param newName = the name to be set for the triangle
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * method setBase: sets the base length of the triangle
     * @param newBase = the base length to be set for the triangle
     */
    public void setBase(double newBase) {
        base = newBase;
    }

    /**
     * method setHeight: sets the height of the triangle
     * @param newHeight = the height to be set for the triangle
     */
    public void setHeight(double newHeight) {
        height = newHeight;
    }

    /**
     * method getArea, calculates and returns the area of the triangle
     * @return the calculated area of the triangle, formula A=0.5bh
     */
    private double getArea() {
        return 0.5 * base * height;
    }
}