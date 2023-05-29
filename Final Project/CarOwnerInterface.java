/**
 * the CarOwnerInterface interface provides a skeleton that highlights
 * the capabilities of all classes that implement it, for the purpose of
 * this assignment that only includes class CarOwner. This interface provides
 * skeletons for getter and setter methods for all CarOwner fields, a method
 * of comparision, and a custom string output
 */
public interface CarOwnerInterface extends Comparable {
    /**
     * setter method skeleton for a car owner's drivers license
     * @param inLicense the license to set
     */
    public void setLicense(String inLicense);

    /**
     * getter method skeleton for a car owner's drivers license
     * @return the license
     */
    public String getLicense();

    /**
     * setter method for a car owner's month of registration
     * @param inMonth the month of registration to set
     */
    public void setMonth(int inMonth);

    /**
     * getter method for a car owner's month of registration
     * @return the month of registration
     */
    public int getMonth();

    /**
     * setter method for a car owner's year of registration
     * @param inYear the year of registration to set
     */
    public void setYear(int inYear);

    /**
     * getter method for a car owner's year of registration
     * @return the year of registration
     */
    public int getYear();

    /**
    * overrides compareTo to sort CarOwners based on chronological
    * of month and year car was last. If param is null or not CarOwner class, returns -1
    * if object total months < param total months, temp is -1, object total months > param total months, temp is 1
    * otherwise the same and temp is 0
    * @return temp
    */
    public int compareTo(Object o);

    /**
     * this method provides the skeleton for the printed output
     * of a CarOwner object
     * @return the string output
     */
    public String toString();
}
