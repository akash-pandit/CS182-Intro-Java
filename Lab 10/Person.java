/**
 * class Person
 * implemented with PersonInterface
 * provides get/set methods for name & custom string output
 */
class Person implements PersonInterface {
    private String name;

    /**
     * empty Person constructor
     * name = No name yet
     */
    Person() {
        name = "No name yet";
    }

    /**
     * Person constructor
     * @param inName name to be set
     */
    Person(String inName) {
        name = inName;
    }

    /**
     * getter method for name
     * @param inName name to be set
     */
    public void setName(String inName) {
        name = inName;
    }

    /**
     * setter method for name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * outputs object name formatted when object printed
     * @return string output for object
     */
    public String toString() {
        return "Name: " + name;
    }
}
