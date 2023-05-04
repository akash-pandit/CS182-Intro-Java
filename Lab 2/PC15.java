import javax.swing.JOptionPane;
/**
 * PC15 (Prog Chall 15) class does the following:
 * 1) initialize variables numShares, pricePerShare, totalCostShares, commission, total, and COMM_RATE
 * 2) Save dialogue box input as temp then convert to double for pricePerShare
 * 3) Re-save dialogue box input as temp then convert to int for numShares
 * 4) Use pricePerShare and numShares to calc totalCostShares, commission, and total
 * 5) Display results in dialogue box
 * 6) Exit!
 *
 * @author Akash Pandit
 * @version v1.0
 * @since 12/18/2023, Akash Pandit, v1.0
 */
public class PC15 {
    public static void main(String[] args)
    {
        int numShares;
        double pricePerShare, totalCostShares, commission, total;
        final double COMM_RATE = 0.02;

        String temp = JOptionPane.showInputDialog("How much does this share cost?");
        pricePerShare = Double.parseDouble(temp);
        temp = JOptionPane.showInputDialog("How many shares would you like to purchase?");
        numShares = Integer.parseInt(temp);

        totalCostShares = pricePerShare * numShares;
        commission = totalCostShares * COMM_RATE;
        total = totalCostShares + commission;

        JOptionPane.showMessageDialog(null, "Total cost of shares are: " +
                String.format("$%,.2f", totalCostShares) + "\nCommission cost is: " +
                String.format("$%,.2f", commission) + "\nTotal cost is: " + String.format("$%,.2f", total));

        System.exit(0);  // exit code 0 all is well
    }
}
