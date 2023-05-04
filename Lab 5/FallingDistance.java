import java.util.Scanner;

/**
 * class FallingDistance
 * 1) init Scanner keyboard, int numOfSecs
 * 2) prompt user to enter a time in secs, collect time in numOfSecs
 * 3) write method getDistance(), runs math operation on numOfSecs to get distance
 * 4) display table for time and distance, use for loop to print out the divider
 * 5) use for loop to print each second and its distance fallen
 * 6) ???
 * 7) Profit
 * 
 * @author Akash Pandit
 * @version v1.0
 * @since 3-12-23, Akash Pandit, v1.0
 */

public class FallingDistance {
    //public constant for acceleration
    public static final double ACCELERATION = 9.8;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numOfSecs;

        System.out.println("Enter a time in seconds (integer) to compute free-fall distance with:");
        numOfSecs = keyboard.nextInt();

        String temp = "Time(secs)\tDistance(m)\t\t";
        System.out.println(temp);
        for (int i = 0; i < temp.length(); i++)
            System.out.print("=");  // Print as many '=' as there are chars in temp
        System.out.println();

        for (int i = 1; i <= numOfSecs; i++)
            System.out.printf(i + "\t\t\t%.2f\n", getDistance(i));

    } //end main

    /**
     * method getDistance:
     * given a time in seconds, it returns the distance an object would free fall given Earth's
     * gravitational constant of 9.8 m/s^2
     *
     * @param secs - time something has been in free fall in seconds
     * @return the distance that something has fallen in secs seconds
     */
    public static double getDistance(int secs) {
        // formula: Distance = 0.5 * g * t^2
        return 0.5 * 9.8 * Math.pow(secs, 2);
    }
}