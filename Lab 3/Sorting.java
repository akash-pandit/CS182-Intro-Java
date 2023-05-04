import java.util.Scanner;

/**
 * Sorting - given 3 integer values, sort them from least to greatest and return them to the user
 * 1) initialize n1, n2, n3, low, med, high
 * 2) initialize scanner object input
 * 3) Prompt the user and collect the 3 numbers and parse as ints to n1, n2, and n3
 * 4) run a series of comparisons to determine which is the lowest, medium, and highest
 * 5) output the numbers in a string output but sorted
 * 6) ???
 * 7) Profit
 *
 * @author Akash Pandit
 * @version v1.0
 * @since 2/25/23, Akash Pandit, v1.0
 */
public class Sorting
{
    public static void main (String[] args){
        //int vars for each number (ie n1) and ints for low, med, high
        int n1, n2, n3, low, med, high;
        Scanner input = new Scanner(System.in);
        //Create a Scanner object
        //create an input message and use Scanner object collect 3 numbers to be sorted
        System.out.println("Please input 3 numbers to be sorted.");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if ((n1<=n2) && (n1<=n3)) {
            low = n1;
            if (n2 <= n3) {
                med = n2;
                high = n3;
            } // end conditional where n1 <= n2 <= n3
            else {
                med = n3;
                high = n2;
            } // end conditional where n1 <= n3 <= n2
        } // end conditional where n1 <= n2 or n3
        else if (n2<=n3) {
            low = n2;
            if (n1 <= n3) {
                med = n1;
                high = n3;
            } //end conditional where n2 <= n1 <= n3
            else {
                med = n3;
                high = n1;
            } // end conditional where n2 <= n3 <= n1
        } // end conditional where n2 <= n1 or n3
        else {
            low = n3;
            if (n1 <= n2) {
                med = n1;
                high = n2;
            } // end conditional where n3 <= n1 <= n2
            else {
                med = n2;
                high = n1;
            } // end conditional where n3 <= n2 <= n1
        } // end conditional where n3 <= n2 or n1
        System.out.println("The inputs sorted smallest to largest are: " +
                low + ' ' + med + ' ' + high);
    }////end main
}////end class