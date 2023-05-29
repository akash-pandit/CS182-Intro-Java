import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistrationMethods implements RegistrationMethodsInterface {
    String inFileName, outFileName, binFileName;
    Scanner scan = new Scanner(System.in);

    /**
     * Prompts the user to provide the location of the csv file to be processed 
     * (registration.csv), the location for where the user wants the output file 
     * saved (output.txt), and the location for the binary file (ltStateBinary.dat).
     */
    public void setFileNames() {
        System.out.println("Enter the path to the registrations.csv file (ie c:/tmp/registration.csv)");
        inFileName = scan.nextLine();

        System.out.println("Enter the path where output.txt should be saved (ie c:/tmp/output.txt)");
        outFileName = scan.nextLine();

        System.out.println("Enter the path where binFile.dat should be saved (ie c:/tmp/binFile.dat)");
        binFileName = scan.nextLine();
    }

    /**
     * Takes csv file (inputFileName) and parses out each record.  split() and nextLine() 
     * will be helpful.  For each line, create a CarOwner object and add to ArrayList <CarOwner>
     * collection
     */
    public void processTextToArrayList(ArrayList<CarOwner> inList) {
        File inFile;
        try {
            inFile = new File(inFileName);
            Scanner inFileScan = new Scanner(inFile);
            inFileScan.nextLine();

            while (inFileScan.hasNextLine()) {
                String[] line;
                CarOwner owner;

                line = inFileScan.nextLine().split(",");
                owner = new CarOwner(line[1], line[0], line[2], Integer.parseInt(line[3]), Integer.parseInt(line[4]));
                
                inList.add(owner);
            }
            inFileScan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Prints out ArrayList passed in based on toString() along with passed in
     * message
     *
     * @param inList ArrayList<CarOwner> collection passed in to be written to
     * a text file
     * @param inMsg Message specific to the array being printed
     * @exception IOException an exception thrown when writing to a file
     */
    public void printArrayListToFile(ArrayList<CarOwner> inList, String inMsg) {

        try {
            FileWriter fw = new FileWriter(outFileName, true);
            PrintWriter outFile = new PrintWriter(fw);

            outFile.println(inMsg);
            for (CarOwner owner: inList) {
                outFile.println(owner);
            } 
            outFile.println();
            outFile.close();
        } 
        catch (SecurityException | IOException e) {
            System.out.println("Error: " + e.getCause() + e.getMessage());
        }   
    }

    /**
     * Takes a ArrayList <CarOwner> collection as an input and creates a binary file output.  
     * The output file can later be read into the java program for processing.
     * 
     * @param inList ArrayList<CarOwner> collection
     */
    public void writeListToBinary(ArrayList<CarOwner> inList) {
        try {
            ObjectOutputStream outBinFile = new ObjectOutputStream(new FileOutputStream(binFileName, true));

            outBinFile.writeObject(inList);

            outBinFile.close();
        } catch (IOException e) {
            System.out.println("writeListToBinary failed: " + e.getMessage());
        }
    }

    /**
     * Reads an ArrayList<CarOwner> collection from a binary file (ltStateBinary.dat).  
     * Then, each ArrayList object item is then written to a newly created CarOwner[], 
     * called temp.  temp is returned to the calling method.
     */
    public CarOwner[] readListFromBinary() {
        ArrayList<CarOwner> collection = null;
        CarOwner[] temp = null;
        
        try {
            ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(binFileName));
            

            collection = (ArrayList<CarOwner>) objectIn.readObject();
            
            objectIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (collection != null) {
            temp = new CarOwner[collection.size()];
            temp = collection.toArray(temp);
        }
        
        return temp;
    }

    /**
     * Prints out array passed in based on toString() along with passed in
     * message
     *
     * @param inArray CarOwner[] array to be written to a text file
     * @param inMsg Message specific to the array being printed
     * @exception IOException an exception thrown when writing to a file
     */
    public void printArrayToFile(CarOwner[] inArray, String inMsg){
        try {
            FileWriter fw = new FileWriter(outFileName, true);
            PrintWriter outFile = new PrintWriter(fw);
            outFile.println(inMsg);


            for (CarOwner owner: inArray) {
                outFile.println(owner);
            }
            outFile.println();
            outFile.close();
        } 
        catch (IOException | SecurityException e) {
            System.out.println("printArrayToFile failed: " + e.getMessage());
        }
    }

    /**
     * Method that generates and returns an array for vehicles whose
     * registration have expired defined as registration is over 12 months old
     * based on current REG_MONTH and REG_YEAR.
     *
     * @param inArray CarOwner[]
     * @return an array of car owners with overdue registrations
     */
    public CarOwner[] flagOverdueOwners(CarOwner[] inArray) {
        ArrayList<CarOwner> expired = new ArrayList<>();

        for (CarOwner owner: inArray) {
            int totalMonths = RegistrationMethods.REG_MONTH + 12 * RegistrationMethods.REG_YEAR;
            totalMonths -= (owner.getMonth() + 12 * owner.getYear());

            if (totalMonths > 12) {
                expired.add(owner);
            }
        }

        CarOwner[] out = new CarOwner[expired.size()];
        for (int i = 0; i < expired.size(); i++) {
            out[i] = expired.get(i);
        }
        return out;
    }

    /**
     * Method that generates and returns an array for vehicles whose
     * registration will expire in three months or less. The state of Looney
     * Tunes sends a reminder three months out to the car owner.
     *
     * @param inArray CarOwner[]
     * @return an array of car owners with registrations within 3 months of expiration
     */
    public CarOwner[] flagAlmostDueOwners(CarOwner[] inArray) {
        ArrayList<CarOwner> almostExpired = new ArrayList<>();

        for (CarOwner owner: inArray) {
            int totalMonths = RegistrationMethods.REG_MONTH + 12 * RegistrationMethods.REG_YEAR;
            totalMonths -= (owner.getMonth() + 12 * owner.getYear());

            if (totalMonths > 9 && totalMonths <= 12) {
                almostExpired.add(owner);
            }
        }

        CarOwner[] out = new CarOwner[almostExpired.size()];
        for (int i = 0; i < almostExpired.size(); i++) {
            out[i] = almostExpired.get(i);
        }
        return out;
    }   
}
