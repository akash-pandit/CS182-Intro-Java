import java.util.ArrayList;
import java.util.Arrays;

/**
 * Final Project: Car Registration
 * 
 * @author Akash Pandit (aspandit@ucsc.edu)
 * @version v1.0
 * @since 5/27/2023, v1.0
 */
public class RegistrationDemo {
    public static void main(String[] args) {
        RegistrationMethods dmv = new RegistrationMethods();
        dmv.setFileNames();

        ArrayList<CarOwner> ltState = new ArrayList<CarOwner>();
        dmv.processTextToArrayList(ltState);
        dmv.printArrayListToFile(ltState, "Initial Set of Car Owners - Unsorted");
        dmv.writeListToBinary(ltState);
        
        CarOwner[] ltStateCopy = dmv.readListFromBinary();
        Arrays.sort(ltStateCopy);
        dmv.printArrayToFile(ltStateCopy, "Sorted list based on Registration date");

        CarOwner[] overdue = dmv.flagOverdueOwners(ltStateCopy);
        dmv.printArrayToFile(overdue, "Owners with Expired Registration");

        CarOwner[] almostDue = dmv.flagAlmostDueOwners(ltStateCopy);
        dmv.printArrayToFile(almostDue, "Owners with registration expiring in 3 months or less      ");
    }
}
