import java.util.Scanner;

public class PC13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create scanner object that takes console input, designated 'input'

        System.out.print("Enter meal amount: $");  // prompt user for input base meal cost
        final double COST = input.nextDouble();
        final double TAX = COST * 0.0675;
        final double TIP = (COST + TAX) * 0.20;
        // constants (or final vars in Java) for the cost, the tax, and the tip (total is all 3 summed up)

        System.out.printf("\nThe tax is: $%,.2f", TAX);  // displays tax w/ formatting
        System.out.printf("\nThe tip amount is: $%,.2f", TIP);  // displays tip w/ formatting
        System.out.printf("\nThe meal cost with tax and tip is: $%,.2f", COST+TAX+TIP);  // displays total w/ formatting
    }
}
