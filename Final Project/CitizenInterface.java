/**
 * the CitizenInterface interface reflects the capabilities of all classes that
 * implement it, for the purpose of this assignment this only includes the Citizen
 * class. This interface provides the skeleton getter and setter methods used by
 * the Citizen class.
 * 
 * @author Akash Pandit (aspandit@ucsc.edu)
 * @version v1.0
 * @since 5/27/2023, v1.0
 */
public interface CitizenInterface {
    /**
     * setter method for a citizen's first name
     * @param inFirst the first name
     */
    public void setFirstName(String inFirst);
    
    /**
     * getter method for a citizen's first name
     * @return their first name
     */
    public String getFirstName();

    /**
     * setter method for a citizen's last name
     * @param inLast the last name
     */
    public void setLastName(String inLast);

    /**
     * getter method for a citizen's last name
     * @return their last name
     */
    public String getLastName();
}
