/**
 * class CarpetCost
 * dependencies: class RoomSize
 *
 * @author Akash Pandit, aspandit@ucsc.edu
 * @version v1.0
 * @since 4/27/2023
 */

class CarpetCost {
    private RoomSize size;
    private double costPerSqFt;

    CarpetCost(RoomSize area, double cost) {
        size = area;
        costPerSqFt = cost;
    }

    public double getCost() {
        return size.getArea() * costPerSqFt;
    }

    public String toString() {
        return size.toString() +
                String.format("Area: %.2f\n", size.getArea()) +
                String.format("The cost per sq ft is $%,.2f\n", costPerSqFt) +
                String.format("The total cost is: $%,.2f\n", getCost());
    }
}
