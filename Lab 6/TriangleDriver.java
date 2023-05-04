/**
 * TriangleDriver for MidTerm Exam Prep
 * @author Rico Cassoni, richard.cassoni@gcccd.edu
 * @version 1.3
 * @since 2/10/2022
 */
public class TriangleDriver { //Change to Main for Replit or MyProgram for codeHS
    public static void main(String args[]) {
        System.out.println("First Triangle");
        System.out.println("--------------");
        Triangle triangle1 = new Triangle();
        triangle1.writeOutput();
        triangle1.setName("Tri1");
        triangle1.setBase(5.0);
        triangle1.setHeight(6.0);
        triangle1.writeOutput();
        System.out.println("\nSecond Triangle");
        System.out.println("--------------");
        Triangle triangle2 = new Triangle("Tri2",7.3,8.3);
        triangle2.writeOutput();
        System.out.println("\nThird Triangle");
        System.out.println("--------------");
        Triangle triangle3 = new Triangle();
        triangle3.readInput(); // set name to Tri3, base to 8.5, and height to 10.3
        triangle3.writeOutput();
    }  //end main
}  //end class
