import java.util.Scanner;

/**
 * Description of class Temperature
 * 1)
 *
 * @author Akash Pandit
 * @version v1.0
 * @since 3/4/2023, Akash Pandit, v1.0
 */
public class Temperature{
    public static void main (String[] args) {
        int inputTemp;
        double output;
        char inputUnit;
        String response;

        Scanner input = new Scanner(System.in);


        do {  ////create working program and then put in do-while

            System.out.println("Enter a temperature in C or F separated by a space (ex. 100 C)");

            inputTemp = input.nextInt();
            inputUnit = input.next().toUpperCase().charAt(0);

            while (!(inputUnit == 'C' || inputUnit == 'F')) {
                System.out.println("Please input either 'C' or 'F' (not case sensitive) as a unit of temperature.");
                inputUnit = input.next().toUpperCase().charAt(0);
            }
            if (inputUnit == 'F') {
                output = (inputTemp - 32) * 5.0 / 9.0;
                System.out.printf("%.1f C\n", output);
            } else {
                output = (inputTemp * 9.0 / 5.0) + 32;
                System.out.printf("%.1f F\n", output);
            }

            System.out.println("Would you like to convert another temperature?");
            response = input.next();
        } while (response.equalsIgnoreCase("yes"));
    }//// end main ()
}//// end class