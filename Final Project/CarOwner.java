import java.io.Serializable;

/**
 * the CarOwner class inherits from the Citizen class and implements the
 * CarOwnerInterface and Serializable interfaces. This class provides getter
 * and settere methods for a car owner's license and month/year of registration
 * as well as a comparision method and a custom string output.
 * 
 * @author Akash Pandit (aspandit@ucsc.edu)
 * @version v1.0
 * @since 5/27/2023, v1.0
 */
public class CarOwner extends Citizen implements CarOwnerInterface, Serializable {
    private String license;
    private int month;
    private int year;

    /**
     * builds a CarOwner object with no parameters, first and last name are set to
     * "No Name", license plate number is set to "Not Assigned", and registration 
     * month/year are both set to 0
     */
    CarOwner() {
        super();
        license = "Not Assigned";
        month = 0;
        year = 0;
    }

    /**
     * builds a CarOwner object with the given parameters
     * @param inFirstName the car owner's first name
     * @param inLastName the car owner's last name
     * @param inLicense the car owner's license number
     * @param inMonth the car owner's registration month
     * @param inYear the car owner's registration year
     */
    CarOwner(String inFirstName, String inLastName, String inLicense, int inMonth, int inYear) {
        super(inFirstName, inLastName);
        license = inLicense;
        month = inMonth;
        year = inYear;
    }

    /**
     * setter method for a car owner's drivers license
     * @param inLicense the license to set
     */
    public void setLicense(String inLicense) {
        license = inLicense;
    }

    /**
     * getter method for a car owner's drivers license
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * setter method for a car owner's month of registration
     * @param inMonth the month of registration to set
     */
    public void setMonth(int inMonth) {
        month = inMonth;
    }

    /**
     * getter method for a car owner's month of registration
     * @return the month of registration
     */
    public int getMonth() {
        return month;
    }

    /**
     * setter method for a car owner's year of registration
     * @param inYear the year of registration to set
     */
    public void setYear(int inYear) {
        year = inYear;
    }

    /**
     * getter method for a car owner's year of registration
     * @return the year of registration
     */
    public int getYear() {
        return year;
    }

    /**
    * overrides compareTo to sort CarOwners based on chronological
    * of month and year car was last. If param is null or not CarOwner class, returns -1
    * if object total months < param total months, temp is -1, object total months > param total months, temp is 1
    * otherwise the same and temp is 0
    * @return temp
    */
    public int compareTo(Object o) {
        int temp = -1;
        if(o != null && getClass() == o.getClass()){
            CarOwner copy = (CarOwner)o;
            if((year*12+month) < (copy.year*12+copy.month))
                temp = -1;
            else if ((year*12+month) > (copy.year*12+copy.month))
                temp = 1;
            else //the same
                temp = 0;
        }
        return temp;
    }

    /**
     * this method provides the skeleton for the printed output
     * of a CarOwner object, printing the full name of the car owner, 
     * their license plate number, and their registration mm/yyyy
     * @return the string output
     */
    public String toString() {
        return super.toString() + "\t\t" + getLicense() + "\t\t" + month + "/" + year;
    }
}
