/**
 * interface PersonInterface
 * provides the framework for building person objects
 */
public interface PersonInterface {
    final static int CURRENT_YEAR = 2023;

    /**
     * setter method skeleton for setName
     * @param name name to be set
     */
    void setName(String name);

    /**
     * getter method skeleton for getName
     * @return a string
     */
    String getName();

    /**
     * string output method skeleton
     * @return a string
     */
    String toString();
}