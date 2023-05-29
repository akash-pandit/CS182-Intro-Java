import java.io.Serializable;

/**
 * the Citizen class implements CitizenInterface and Serializable,
 * it defines citizen objects with a first and last name, and provides
 * methods to get and set those attributes.
 * 
 * @author Akash Pandit (aspandit@ucsc.edu)
 * @version v1.0
 * @since 5/27/2023, v1.0
 */
public class Citizen implements CitizenInterface, Serializable {
    private String firstName;
    private String lastName;

    /**
     * empty citizen constructor with their first and last name
     * being set to "No Name"
     */
    Citizen() {
        firstName = "No Name";
        lastName = "No Name";
    }

    /**
     * citizen constructor that instantiates a citizen with the given
     * first and last name
     * @param inFirst the citizen's first name
     * @param inLast the citizen's last name
     */
    Citizen(String inFirst, String inLast) {
        firstName = inFirst;
        lastName = inLast;
    }

    /**
     * setter method for a citizen's first name
     * @param inFirst the first name
     */
    public void setFirstName(String inFirst) {
        firstName = inFirst;
    }

    /**
     * getter method for a citizen's first name
     * @return their first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setter method for a citizen's last name
     * @param inLast the last name
     */
    public void setLastName(String inLast) {
        lastName = inLast;
    }

    /**
     * getter method for a citizen's last name
     * @return their last name
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * when a Citizen object is printed, this method ensures that what is
     * printed is the citizen's first and last name, separated by a space.
     * @return a string interpretation of a Citizen object
     */
    public String toString() {
        return firstName + " " + lastName;
    }
}