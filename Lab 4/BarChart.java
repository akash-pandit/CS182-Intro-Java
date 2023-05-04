import java.util.Random;

/**
 * Description of class BarChart
 * 1) initialize ints first, second, third
 * 2) create random object gen
 * 3) create printStars method which prints stars based on the integer divided by 100 floored,
 *    with a no stars message for any numbers below 100
 * 4) use gen to generate random numbers from 0 to 999 by assigning nextInt(999) values to first, second and third
 * 5) print out the numbers
 * 6) print out the ASCII bar chart by calling printStars(num)
 * 7) ???
 * 8) Profit
 *
 * @author Akash Pandit
 * @version v1.0
 * @since 3/4/2023, Akash Pandit, v1.0
 */
public class BarChart {
    public static void main(String[] args) {
        ////vars section
        int first, second, third;

        Random gen = new Random();
        //Use generator to create a random number btw 0 and 999 and assign to first.  Do the same for second and third
        first = gen.nextInt(999);
        second = gen.nextInt(999);
        third = gen.nextInt(999);
        System.out.println("Number 1 is " + first + "\nNumber 2 is " + second + "\nNumber 3 is " + third + "\n");

        ////Bar Chart Section
        //Print out NUMBER BAR CHART as a header
        System.out.println("========NUMBER BAR CHART========");

        ////first stars
        //Print out "Number 1: " without a line break
        System.out.print("Number 1: ");
        printStars(first);


        ////second stars
        //Print out "Number 2: " without a line break
        System.out.print("Number 2: ");
        printStars(second);

        ////third stars
        //Print out "Number 3: " without a line break
        System.out.print("Number 3: ");
        printStars(third);
    }////end main()

    /**
     * Accepts int input and prints stars
     *
     * @param input - number of stars to print out
     */
    public static void printStars(int input) {
        if (input < 100)
            System.out.print("No stars printed for inputs < 100");
        else
            for (int i = 0; i < input / 100; i++)
                System.out.print('*');
        System.out.println();

    }
}
