import java.util.Scanner;
import javax.swing.*;
import java.io.*;  //Note - Since we are using multiple classes from java.io, we can use the * wildcard vs listing each individually.  Any 2+, it is best to use *

/**
 * class Grades
 * 1) init strings inFile, outFile
 * 2) set inFile to the output of method getInFile()
 * 3) getInFile(): takes str input as filename, checks if filename exists, if so returns it, if not while pit
 * 4) set outFile to the output of method getOutFile(), the output of a JOptionPane.showInputDialog method
 * 5) execute processFile method which displays grade statistics in file outFile (see method docstring for desc)
 * 6) print where to find results
 * 7) ???
 * 8) Profit
 *
 * [[NOTE]] edited input.txt so row 2 is '-1' instead of '- 1', could not figure out how to deal with extraneous space
 * works as intended if that extra space is removed and row 2 is just '-1' in input.txt
 *
 * 
 * @author Akash Pandit
 * @version v1.0
 * @since 3-12-23, Akash Pandit, v1.0
 **/
public class Grades {
    public static void main(String[] args) throws IOException{  //look how small main() is when we divide and conquer into (resusable) methods!  Only 4 lines!!!
        //String vars inFile, outFile for the file names
        String inFile, outFile;
        inFile = getInFile();
        outFile = getOutFile();
        processFile(inFile, outFile);
        System.out.println("You can retrieve the output file at: " + outFile);

    }//end main

    /**
     * Uses JOptionPane to get and return input file name
     * @return str, name of file from JOptionPane
     */
    public static String getInFile() throws IOException { //Requires throws IOException since File throws IOException

        String fileName;
        fileName = JOptionPane.showInputDialog("Enter the name of the input file (ie input.txt)");

        File file = new File(fileName);
        while (!file.exists())
            fileName = JOptionPane.showInputDialog("Please enter an existing filename.\n" +
                    "Enter the name of the input file (ie input.txt)");

        return fileName;
    }

    /**
     * Uses JOptionPane to collect a filename to use for output in processFile
     * @return String (the file name given as input in a JOptionPane)
     */
    public static String getOutFile() {

    //create a method to generate and return a String for the output file name.  NOTE - No throws IOException here.
        //can be a simple return with a JOptionPane Input Dialog
        return JOptionPane.showInputDialog(null, "Enter a file name:");
    }

    /**
     * method processFile
     * initializes int vars for grades, num, a min grade, max grade, sum of grades, num of grades, and iteration
     * creates file object file and scans input grades from them
     * 2 while loops, one for each line of grades and one for each grade in the line
     * runs each num through an if else if to increment grade vars
     * outputs results to file
     *
     * @param inFileName - str, name of the file with input grades
     * @param inOutFile - str, name of the file to output results to
     */
    public static void processFile(String inFileName, String inOutFile) throws IOException {
        int num, As, Bs, Cs, Ds, Fs, min, max, total, count, set = 1;
        double avg;

        File file = new File(inFileName);
        Scanner object = new Scanner(file);

        PrintWriter output = new PrintWriter(inOutFile);

        while (object.hasNextLine()) {
            As = Bs = Cs = Ds = Fs = count = total = 0;

            num = object.nextInt();

            min = max = num;
            while (num != -1) {
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
                count += 1;
                total += num;
                if (num >= 90) {
                    As++;
                } else if (num >= 80) {
                    Bs++;
                } else if (num >= 70) {
                    Cs++;
                } else if (num >= 60) {
                    Ds++;
                } else {
                    Fs++;
                }
                num = object.nextInt();
            } // end while loop iterating over nums in row
            output.println("Set " + set + " of grades calculated");
            set++;
            if (count == 0) {
                output.println("No grades to average");
            } else {
                output.println("Number of As: " + As);
                output.println("Number of Bs: " + Bs);
                output.println("Number of Cs: " + Cs);
                output.println("Number of Ds: " + Ds);
                output.println("Number of Fs: " + Fs);
                output.println("The high score was: " + max);
                output.println("The low score was: " + min);
                avg = (double) total / count;
                output.printf("The average score was: %.1f\n", avg);
            } // end else clause outputting results to file
        } // end while loop iterating over lines
        System.out.println("Grade processing is completed.");
        output.close();
    } //end method processFile

} //end class grades
