import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * class SalesAnalysisDemo
 * driver file for SalesAnalysis: grab a file path, validate it, 
 * create SalesAnalysis object with filepath, run methods
 * 
 * @author Akash Pandit (aspandit@ucsc.edu)
 * @since v1.0, 5/5/2023
 */

 class SalesAnalysisDemo {
    public static void main(String[] args) throws IOException {
        // initialize field vars
        Scanner scanner = new Scanner(System.in);
        String filePath;
        SalesAnalysis salesAnalysis;

        // gather user input
        System.out.print("Please input a valid file path: ");
        filePath = scanner.nextLine();
        File file = new File(filePath);

        // file validation and scanner handling
        while (!file.exists()) {
            System.out.print("Invalid path. Please input a valid file path: ");
            filePath = scanner.nextLine();
            file = new File(filePath);
        }
        scanner.close();

        // create SalesAnalysis object w/ filepath and run methods
        salesAnalysis = new SalesAnalysis(filePath);
        salesAnalysis.processFile();
        salesAnalysis.writeOutput();
    }
 }