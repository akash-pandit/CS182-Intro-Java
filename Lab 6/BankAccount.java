
/**
 * class BankAccount
 * a class where users can create a bank account and optionally initialize a starting balance and a custom interest rate.
 * methods for making deposits and withdrawals with both double and String number inputs, for calculating and adding
 * monthly interest, and getter methods to retrieve balance, total deposits, total withdrawals, and total accrued interest.
 *
 * @author Akash Pandit
 * @version 4/7/2023
 */
public class BankAccount
{
    private double balance, deposit, withdraw, interest, monthlyIntRate;
    // initialize private double vars for user balance, total deposit, withdraw, and interest counters, and the monthly
    // interest rate

    /**
     * constructor BankAccount
     * empty constructur, all vars but monthlyIntRate are set to 0 by Java and monthlyIntRate is set to .035/12
     */
    BankAccount() {
        monthlyIntRate = 0.035/12;  // initialize monthly interest rate to yearly interest rate (3.5% or 0.035) divided
        // by 12 for the 12 months
    }

    /**
     * constructor BankAccount 
     * builds a BankAccount object with double parameters inBalance and intRate
     * @param inBalance a given double balance that the bank account is created with
     * @param intRate a given double intRate that gives the yearly interest rate percentage
     */
    BankAccount(double inBalance, double intRate) {
        balance = inBalance;  // initialize the balance to the given parameter inBalance
        monthlyIntRate = (intRate/100)/12;
        // initialize the monthly interest rate by taking the given yearly interest rate %, dividing by 100 to clear the
        // %, and dividing by 12 to get the monthly interest proportion
    }

    /**
     * constructor BankAccount
     * builds a BankAccount object with String parameters inBalance and intRate
     * (these parameters are parsed into doubles in all uses, this constructor only exists to be flexible with parameter
     * typings)
     * @param inBalance a given String balance that once parsed to a double, gives the user's starting balance
     * @param intRate a given String intRate that once parsed to a double, gives the user's yearly interest rate %.
     */
    BankAccount(String inBalance, String intRate) {
        balance = Double.parseDouble(inBalance);  // initialize the balance to the given parameter inBalance
        monthlyIntRate = (Double.parseDouble(intRate)/100)/12;
        // initialize the monthly interest rate by taking the given yearly interest rate %, dividing by 100 to clear the
        // %, and dividing by 12 to get the monthly interest proportion
    }

    /**
     * public method makeDeposit
     * deposits money of amount add into the bank account
     * @param add double parameter that represents money to be deposited
     */
    public void makeDeposit(double add) {
        deposit += add;  // increase the total deposit counter
        balance += add;  // increase the balance by the deposited amount
    }

    /**
     * public method makeDeposit
     * deposits money of amount add into the bank account after parsing the String add to a double
     * @param add String parameter that after being parsed to a double represents money to be deposited
     */
    public void makeDeposit(String add) {
        deposit += Double.parseDouble(add);  // increase the total deposit counter
        balance += Double.parseDouble(add);  // increase the balance by the deposited amount
    }

    /**
     * public method makeWithdraw
     * withdraws money of amount sub from the bank account
     * @param sub double parameter that represents money to be withdrawn
     */
    public void makeWithdraw(double sub) {
        withdraw += sub;  // increase the total withdraw counter
        balance -= sub;  // decrease the balance by the withdrawn amount
    }

    /**
     * public method makeWithdraw
     * withdraws money of amount sub from account after parsing sub from a String to a double
     * @param sub String parameter that after parsing to double represents money to be withdrawn
     */
    public void makeWithdraw(String sub) {
        withdraw += Double.parseDouble(sub);  // increase the total withdraw counter
        balance -= Double.parseDouble(sub);  // decrease the balance by the withdrawn amount
    }

    /**
     * public method calcInterest
     * calculates and adds interest every month to user balance and to the total interest accrued counter
     */
    public void calcInterest() {
        if (balance > 0) {
            interest += balance * monthlyIntRate;  // increase the total interest counter
            balance += balance * monthlyIntRate;  // add the month's interest to the balance
        }
    }

    /**
     * public getter method getBalance
     * @return the user's balance, a double
     */
    public double getBalance() {
        return balance;
    }

    /**
     * public getter method getDeposit
     * @return the user's total deposits summed up, a double
     */
    public double getDeposit() {
        return deposit;
    }

    /**
     * public getter method getWithdraw
     * @return the user's total withdrawals summed up, a double
     */
    public double getWithdraw() {
        return withdraw;
    }

    /**
     * public getter method getInterest
     * @return the user's total interest accrued, a double
     */
    public double getInterest() {
        return interest;
    }
}
