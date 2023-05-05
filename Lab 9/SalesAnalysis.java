import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * class SalesAnalysis
 * TODO: finish writing desc
 * 
 * @author Akash Pandit (aspandit@ucsc.edu)
 * @since v1.0, 5/5/2023
 */
class SalesAnalysis {
    ArrayList<Double> weeklyNumber = new ArrayList<Double>(0);
    String inputFile;

    public static int DAYS_OF_WEEK = 7;

    /**
     * constructor for a SalesAnalysis object
     * creates a SalesAnalysis object, setting inputFile to the filePath parameter
     * @param filePath string value representing a validated filepath
     */
    SalesAnalysis(String filePath) {
        inputFile = filePath;
    }

    /**
     * public method processFile
     * creates file object from inputFile string, scans the data in as an array of strings for each line,
     * and executes setArrayListElement on each of those string arrays
     * @throws IOException
     */
    public void processFile() throws IOException {
        File file = new File(inputFile);
        Scanner scanner = new Scanner(file);
        String[] lineArray;

        while (scanner.hasNextLine()) {
            lineArray = scanner.nextLine().split(",");
            setArrayListElement(lineArray);
        }
        scanner.close();
    }

    /**
     * private method setArrayListElement
     * converts string array values to Double arraylist values and adds them to an existing ArrayList<Double>
     * @param inArray an array of string values for sales numbers (dollars)
     */
    private void setArrayListElement(String[] inArray) {
        double total = 0;
        for (String element: inArray) {
            total += Double.parseDouble(element);
        } 
        System.out.println(weeklyNumber);
        weeklyNumber.add(Double.valueOf(total));
    } 

    /**
     * public method writeOutput
     * outputs statistics for each week's sales and summary statistics for all weeks to stdout
     */
    public void writeOutput() {
        double totalSales = 0;
        double weeklyTotal;
        int minWeek = 0, maxWeek = 0;

        for (int week = 0; week < weeklyNumber.size(); week++) {
            weeklyTotal = weeklyNumber.get(week);
            
            // get min and max week for total statistics
            if (weeklyTotal < weeklyNumber.get(minWeek)) {
                minWeek = week;
            } if (weeklyTotal > weeklyNumber.get(maxWeek)) {
                maxWeek = week;
            }

            // print out weekly statistics to stdout
            System.out.println("Week" + (week + 1) + "Info");
            System.out.println(String.format("Total Sales: $%,.2f", weeklyTotal));
            System.out.print(String.format("Avg Daily Sales for Week: $%,.2f\n", weeklyTotal / DAYS_OF_WEEK));
            totalSales += weeklyTotal;
        }
        // print total statistics to stdout
        System.out.println(String.format("Total Sales for all Weeks: $%,.2f", totalSales));
        System.out.println(String.format("Avg Weekly Sales: $%,.2f", totalSales / weeklyNumber.size()));
        System.out.println("Week" + (maxWeek + 1) + " had the highest amount of sales");
        System.out.println("Week" + (minWeek + 1) + " had the lowest amount of sales");
    }
}
