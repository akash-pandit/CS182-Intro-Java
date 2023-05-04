import java.util.Scanner;

/**
 * ValidDate determines if a date in mm/dd/yyyy format is a valid date or not and provides reasoning
 * 1) initialize month, day, year, temp, and output
 * 2) prompt user for date
 * 3) create scanner object input and set delimiter as '/'
 * 4) set month and day and use temp to set year
 * 5) begin conditionals, invalid dates for all months get eliminated first
 * 6) invalid dates for 30d months get eliminated
 * 7) invalid dates for feb get eliminated, >29 on leap years and >28 on normal years
 * 8) default statement handles incorrect months, all int years are considered legitimate
 * 9) output given
 * 10) ???
 * 11) Profit
 *
 * @author Akash Pandit
 * @version v1.0
 * @since 2/25/23, Akash Pandit, v1.0
 */
public class ValidDate {
    public static void main (String[] args){
        int month, day, year;
        String temp = "", output = null;

        System.out.println("Please enter a date (mm/dd/yyyy):");
        Scanner input = new Scanner(System.in);
        input.useDelimiter("/");

        month = input.nextInt();
        day = input.nextInt();
        temp = input.nextLine().substring(1);
        year = Integer.parseInt(temp);

        boolean isValid = false;

        if (day < 1) {
            output = month+"/"+day+"/"+year+" is not a valid date. Months can never have less than 1 day.";
        } else if (day > 31) {
            output = month+"/"+day+"/"+year+" is not a valid date. Cannot have more than 31 days in any month.";
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    isValid = true;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day < 31) {
                        isValid = true;
                    } else {
                        output = month+"/"+day+"/"+year+" is not a valid date. Cannot have 31 days in this month.";
                    } break;
                case 2:
                    boolean isLeapYear = false;
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    } else if ((year % 100 != 0) && (year % 4 == 0)) {
                        isLeapYear = true;
                    }
                    if (isLeapYear && day > 29) {
                        output = month+"/"+day+"/"+year+" is not a valid date. Cannot have 30 or more days in a leap year.";
                    } else if (!isLeapYear && day > 28) {
                        output = month+"/"+day+"/"+year+" is not a valid date. Cannot have 29 or more days in a non leap year.";
                    } else {
                        isValid = true;
                    } break;
                default:
                    output = month+"/"+day+"/"+year+" is not a valid date.  Months must be 1 to 12.";

            } // end switch
        } // end if else if
        if (isValid) 
            System.out.println(month+"/"+day+"/"+year+" is a valid date.");
        else System.out.println(output);
    }////end main
}////end class