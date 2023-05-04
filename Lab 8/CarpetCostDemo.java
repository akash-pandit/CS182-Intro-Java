import java.util.Scanner;

/**
 * Empire Today
 * Create classes for CarpetCost and RoomSize to demonstrate advanced class principles
 * with these classes
 *
 * @author Akash Pandit (aspandit@ucsc.edu)
 * @version v1.0, 4/29/2023
 */

class CarpetCostDemo {
    public static void main(String args[]) {
        // declare variables
        Scanner scanner = new Scanner(System.in);
        String name, clearScanner;
        float length, width, costPerSqFt;

        // just to do this for 2 rooms
        for (int i = 0; i < 2; i++) {
            // assign variables
            System.out.print("Enter Room Name: ");
            name = scanner.nextLine();
            System.out.print("Enter room length: ");
            length = scanner.nextFloat();
            System.out.print("Enter room width: ");
            width = scanner.nextFloat();
            System.out.print("Enter cost per square foot: ");
            costPerSqFt = scanner.nextFloat();
            System.out.println();
            clearScanner = scanner.nextLine();


            // create a dummy roomsize object size
            RoomSize size = new RoomSize(name, length, width);
            // create a carpetcost object cost using size
            CarpetCost cost = new CarpetCost(size, costPerSqFt);
            // prints cost (runs cost.toString() implicitly)
            System.out.println(cost);
        }
    }  // end method main
}  // end class CarpetCostDemo
