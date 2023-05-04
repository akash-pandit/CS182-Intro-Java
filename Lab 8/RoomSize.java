/**
 * class RoomSize
 * creates an object with data about a particular room and its size
 * contains methods to get room area and output all its data
 * can be built with given parameters or copied from another RoomSize object
 *
 * @author Akash Pandit, aspandit@ucsc.edu
 * @version v1.0
 * @since 4/27/2023
 */
class RoomSize {
    private String name;
    private double length;
    private double width;

    /**
     * constructor for a RoomSize object
     * @param inName - String, the name of the room
     * @param inLen - double, length of the room
     * @param inWidth - double, width of the room
     */
    RoomSize(String inName, double inLen, double inWidth) {
        name = inName;
        length = inLen;
        width = inWidth;
    }

    /**
     * copy constructor RoomSize
     * @param size a RoomSize objects, its parameters are copied over to the new object
     */
    RoomSize(RoomSize size) {
        name = size.name;
        length = size.length;
        width = size.width;
    }

    /**
     * public method getArea
     * @return the area (a double) of the room, calculated by l * w
     */
    public double getArea() {
        return length * width;
    }

    /**
     * overloaded method toString
     * @return name, length, and width formatted in a string output
     */
    public String toString() {
        return "Room Name: " + name +
                "\nLength: " + String.format("%.1f", length) +
                "\nWidth: " + String.format("%.1f", width) + "\n";
    }
}
